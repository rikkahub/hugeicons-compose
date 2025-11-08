package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Folders: ImageVector
    get() {
        if (_folders != null) {
            return _folders!!
        }
        _folders = ImageVector.Builder(
            name = "Folders",
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
        moveTo(7.5f, 9.05568f)
        horizontalLineTo(16.275f)
        curveTo(18.171f, 9.05568f, 19.119f, 9.05568f, 19.8f, 9.50509f)
        curveTo(20.0949f, 9.69965f, 20.348f, 9.94965f, 20.545f, 10.2408f)
        curveTo(21f, 10.9134f, 21f, 11.8497f, 21f, 13.7223f)
        curveTo(21f, 16.8434f, 21f, 18.4039f, 20.2416f, 19.5249f)
        curveTo(19.9133f, 20.0102f, 19.4914f, 20.4268f, 19.0001f, 20.7511f)
        curveTo(17.8651f, 21.5001f, 16.285f, 21.5001f, 13.125f, 21.5001f)
        horizontalLineTo(12f)
        curveTo(7.75736f, 21.5001f, 5.63604f, 21.5001f, 4.31802f, 20.1984f)
        curveTo(3f, 18.8966f, 3f, 16.8015f, 3f, 12.6112f)
        verticalLineTo(9.89503f)
        curveTo(3f, 8.28039f, 3f, 7.47307f, 3.34228f, 6.86729f)
        curveTo(3.58628f, 6.43547f, 3.94704f, 6.07916f, 4.38426f, 5.83818f)
        curveTo(4.99761f, 5.50012f, 5.81502f, 5.50012f, 7.44984f, 5.50012f)
        curveTo(8.49722f, 5.50012f, 9.02091f, 5.50012f, 9.47933f, 5.66991f)
        curveTo(10.526f, 6.05756f, 10.9576f, 6.99663f, 11.4299f, 7.92957f)
        lineTo(12f, 9.05568f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 2.5001f)
        horizontalLineTo(8.5f)
        curveTo(9.47008f, 2.5001f, 10.4182f, 2.47179f, 11.2387f, 3.05532f)
        curveTo(12.29f, 3.80299f, 12.71f, 5.1972f, 13.7613f, 5.94487f)
        curveTo(14.5818f, 6.52841f, 15.5299f, 6.5001f, 16.5f, 6.5001f)
        horizontalLineTo(21f)
        }
        }.build()

        return _folders!!
    }

private var _folders: ImageVector? = null
