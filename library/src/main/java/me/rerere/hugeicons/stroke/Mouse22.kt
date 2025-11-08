package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mouse22: ImageVector
    get() {
        if (_mouse22 != null) {
            return _mouse22!!
        }
        _mouse22 = ImageVector.Builder(
            name = "Mouse22",
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
        moveTo(12f, 22f)
        curveTo(18f, 22f, 19.5f, 17.49f, 19.5f, 12f)
        curveTo(19.5f, 6.50998f, 18f, 2f, 12f, 2f)
        curveTo(5.99993f, 2f, 4.5f, 6.50996f, 4.5f, 12f)
        curveTo(4.5f, 17.49f, 5.99993f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 7.5f)
        curveTo(10.5f, 7.03406f, 10.5f, 6.80109f, 10.5761f, 6.61732f)
        curveTo(10.6776f, 6.37229f, 10.8723f, 6.17761f, 11.1173f, 6.07612f)
        curveTo(11.3011f, 6f, 11.5341f, 6f, 12f, 6f)
        curveTo(12.4659f, 6f, 12.6989f, 6f, 12.8827f, 6.07612f)
        curveTo(13.1277f, 6.17761f, 13.3224f, 6.37229f, 13.4239f, 6.61732f)
        curveTo(13.5f, 6.80109f, 13.5f, 7.03406f, 13.5f, 7.5f)
        verticalLineTo(9.5f)
        curveTo(13.5f, 9.96594f, 13.5f, 10.1989f, 13.4239f, 10.3827f)
        curveTo(13.3224f, 10.6277f, 13.1277f, 10.8224f, 12.8827f, 10.9239f)
        curveTo(12.6989f, 11f, 12.4659f, 11f, 12f, 11f)
        curveTo(11.5341f, 11f, 11.3011f, 11f, 11.1173f, 10.9239f)
        curveTo(10.8723f, 10.8224f, 10.6776f, 10.6277f, 10.5761f, 10.3827f)
        curveTo(10.5f, 10.1989f, 10.5f, 9.96594f, 10.5f, 9.5f)
        verticalLineTo(7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        verticalLineTo(2f)
        }
        }.build()

        return _mouse22!!
    }

private var _mouse22: ImageVector? = null
