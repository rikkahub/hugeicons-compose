package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PresentationLineChart01: ImageVector
    get() {
        if (_presentationLineChart01 != null) {
            return _presentationLineChart01!!
        }
        _presentationLineChart01 = ImageVector.Builder(
            name = "PresentationLineChart01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 8f)
        curveTo(2.5f, 5.17157f, 2.5f, 3.75736f, 3.37868f, 2.87868f)
        curveTo(4.25736f, 2f, 5.67157f, 2f, 8.5f, 2f)
        horizontalLineTo(15.5f)
        curveTo(18.3284f, 2f, 19.7426f, 2f, 20.6213f, 2.87868f)
        curveTo(21.5f, 3.75736f, 21.5f, 5.17157f, 21.5f, 8f)
        verticalLineTo(11f)
        curveTo(21.5f, 13.8284f, 21.5f, 15.2426f, 20.6213f, 16.1213f)
        curveTo(19.7426f, 17f, 18.3284f, 17f, 15.5f, 17f)
        horizontalLineTo(8.5f)
        curveTo(5.67157f, 17f, 4.25736f, 17f, 3.37868f, 16.1213f)
        curveTo(2.5f, 15.2426f, 2.5f, 13.8284f, 2.5f, 11f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 9.72467f)
        lineTo(8.69655f, 8.81016f)
        curveTo(9.57522f, 7.65654f, 11.1291f, 7.74849f, 11.9058f, 9.00005f)
        curveTo(12.6564f, 10.2095f, 14.1427f, 10.3438f, 15.0402f, 9.28328f)
        lineTo(16f, 8.14917f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 22f)
        lineTo(12.0001f, 19f)
        lineTo(17f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17.5f)
        verticalLineTo(22f)
        }
        }.build()

        return _presentationLineChart01!!
    }

private var _presentationLineChart01: ImageVector? = null
