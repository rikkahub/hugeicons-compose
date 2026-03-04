package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Prescriptions: ImageVector
    get() {
        if (_prescriptions != null) {
            return _prescriptions!!
        }
        _prescriptions = ImageVector.Builder(
            name = "Prescriptions",
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
        moveTo(10f, 22f)
        horizontalLineTo(9f)
        curveTo(6.17157f, 22f, 4.75736f, 22f, 3.87868f, 21.1213f)
        curveTo(3f, 20.2426f, 3f, 18.8284f, 3f, 16f)
        verticalLineTo(8f)
        curveTo(3f, 5.17157f, 3f, 3.75736f, 3.87868f, 2.87868f)
        curveTo(4.75736f, 2f, 6.17157f, 2f, 9f, 2f)
        horizontalLineTo(13f)
        curveTo(15.8284f, 2f, 17.2426f, 2f, 18.1213f, 2.87868f)
        curveTo(19f, 3.75736f, 19f, 5.17157f, 19f, 8f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 11f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 15f)
        horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.6213f, 21.3787f)
        lineTo(20.3787f, 17.6213f)
        curveTo(20.7765f, 17.2235f, 21f, 16.6839f, 21f, 16.1213f)
        curveTo(21f, 14.9497f, 20.0503f, 14f, 18.8787f, 14f)
        curveTo(18.3161f, 14f, 17.7765f, 14.2235f, 17.3787f, 14.6213f)
        lineTo(13.6213f, 18.3787f)
        curveTo(13.2235f, 18.7765f, 13f, 19.3161f, 13f, 19.8787f)
        curveTo(13f, 21.0503f, 13.9497f, 22f, 15.1213f, 22f)
        curveTo(15.6839f, 22f, 16.2235f, 21.7765f, 16.6213f, 21.3787f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 16.5f)
        lineTo(18.5f, 19.5f)
        }
        }.build()

        return _prescriptions!!
    }

private var _prescriptions: ImageVector? = null
