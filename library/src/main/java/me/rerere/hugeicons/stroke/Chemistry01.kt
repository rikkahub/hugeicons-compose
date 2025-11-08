package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chemistry01: ImageVector
    get() {
        if (_chemistry01 != null) {
            return _chemistry01!!
        }
        _chemistry01 = ImageVector.Builder(
            name = "Chemistry01",
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
        moveTo(3f, 9f)
        lineTo(11f, 9f)
        moveTo(20f, 9f)
        lineTo(17f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.0002f, 4f)
        verticalLineTo(14.7857f)
        curveTo(17.0002f, 16.5609f, 15.6571f, 18f, 14.0002f, 18f)
        curveTo(12.3433f, 18f, 11.0002f, 16.5609f, 11.0002f, 14.7857f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.0002f, 3f)
        verticalLineTo(13f)
        curveTo(5.0002f, 16.7712f, 5.0002f, 18.6569f, 6.17177f, 19.8284f)
        curveTo(7.34334f, 21f, 9.22896f, 21f, 13.0002f, 21f)
        horizontalLineTo(21.0002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.0002f, 4f)
        lineTo(18.0002f, 4f)
        }
        }.build()

        return _chemistry01!!
    }

private var _chemistry01: ImageVector? = null
