package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = ImageVector.Builder(
            name = "Bank",
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
        moveTo(2f, 8.56907f)
        curveTo(2f, 7.37289f, 2.48238f, 6.63982f, 3.48063f, 6.08428f)
        lineTo(7.58987f, 3.79744f)
        curveTo(9.7431f, 2.59915f, 10.8197f, 2f, 12f, 2f)
        curveTo(13.1803f, 2f, 14.2569f, 2.59915f, 16.4101f, 3.79744f)
        lineTo(20.5194f, 6.08428f)
        curveTo(21.5176f, 6.63982f, 22f, 7.3729f, 22f, 8.56907f)
        curveTo(22f, 8.89343f, 22f, 9.05561f, 21.9646f, 9.18894f)
        curveTo(21.7785f, 9.88945f, 21.1437f, 10f, 20.5307f, 10f)
        horizontalLineTo(3.46928f)
        curveTo(2.85627f, 10f, 2.22152f, 9.88944f, 2.03542f, 9.18894f)
        curveTo(2f, 9.05561f, 2f, 8.89343f, 2f, 8.56907f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9959f, 7f)
        horizontalLineTo(12.0049f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 10f)
        verticalLineTo(18.5f)
        moveTo(8f, 10f)
        verticalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 10f)
        verticalLineTo(18.5f)
        moveTo(20f, 10f)
        verticalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 18.5f)
        horizontalLineTo(5f)
        curveTo(3.34315f, 18.5f, 2f, 19.8431f, 2f, 21.5f)
        curveTo(2f, 21.7761f, 2.22386f, 22f, 2.5f, 22f)
        horizontalLineTo(21.5f)
        curveTo(21.7761f, 22f, 22f, 21.7761f, 22f, 21.5f)
        curveTo(22f, 19.8431f, 20.6569f, 18.5f, 19f, 18.5f)
        }
        }.build()

        return _bank!!
    }

private var _bank: ImageVector? = null
