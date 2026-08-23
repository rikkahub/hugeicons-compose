package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinKey: ImageVector
    get() {
        if (_bitcoinKey != null) {
            return _bitcoinKey!!
        }
        _bitcoinKey = ImageVector.Builder(
            name = "BitcoinKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 2f)
            curveTo(5.23858f, 2f, 3f, 4.23858f, 3f, 7f)
            curveTo(3f, 9.05032f, 4.2341f, 10.8124f, 6f, 11.584f)
            verticalLineTo(19.375f)
            curveTo(6f, 19.6639f, 6f, 19.8084f, 6.03937f, 19.9445f)
            curveTo(6.04682f, 19.9703f, 6.0553f, 19.9957f, 6.0648f, 20.0208f)
            curveTo(6.11498f, 20.1533f, 6.20165f, 20.2689f, 6.375f, 20.5f)
            lineTo(7.2f, 21.6f)
            curveTo(7.38885f, 21.8518f, 7.68524f, 22f, 8f, 22f)
            curveTo(8.31476f, 22f, 8.61115f, 21.8518f, 8.8f, 21.6f)
            lineTo(9.625f, 20.5f)
            curveTo(9.79835f, 20.2689f, 9.88502f, 20.1533f, 9.9352f, 20.0208f)
            curveTo(9.9447f, 19.9957f, 9.95318f, 19.9703f, 9.96063f, 19.9445f)
            curveTo(10f, 19.8084f, 10f, 19.6639f, 10f, 19.375f)
            verticalLineTo(19.0364f)
            curveTo(10f, 18.6277f, 10f, 18.4233f, 9.92388f, 18.2396f)
            curveTo(9.84776f, 18.0558f, 9.70324f, 17.9113f, 9.41421f, 17.6222f)
            lineTo(8.79198f, 17f)
            lineTo(9.41421f, 16.3778f)
            curveTo(9.70324f, 16.0887f, 9.84776f, 15.9442f, 9.92388f, 15.7604f)
            curveTo(10f, 15.5767f, 10f, 15.3723f, 10f, 14.9636f)
            verticalLineTo(11.584f)
            curveTo(11.7659f, 10.8124f, 13f, 9.05032f, 13f, 7f)
            curveTo(13f, 4.23858f, 10.7614f, 2f, 8f, 2f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16f, 12.5f)
            horizontalLineTo(19f)
            curveTo(19.8284f, 12.5f, 20.5f, 13.1716f, 20.5f, 14f)
            verticalLineTo(14.5f)
            curveTo(20.5f, 15.3284f, 19.8284f, 16f, 19f, 16f)
            horizontalLineTo(16f)
            moveTo(16f, 12.5f)
            verticalLineTo(16f)
            moveTo(16f, 12.5f)
            horizontalLineTo(15f)
            moveTo(16f, 16f)
            horizontalLineTo(19.5f)
            curveTo(20.3284f, 16f, 21f, 16.6716f, 21f, 17.5f)
            verticalLineTo(18f)
            curveTo(21f, 18.8284f, 20.3284f, 19.5f, 19.5f, 19.5f)
            horizontalLineTo(16f)
            moveTo(16f, 16f)
            verticalLineTo(19.5f)
            moveTo(18f, 12.5f)
            verticalLineTo(11f)
            moveTo(18f, 19.5f)
            verticalLineTo(21f)
            moveTo(16f, 19.5f)
            horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8.25f, 7f)
            horizontalLineTo(8f)
            moveTo(8.5f, 7f)
            curveTo(8.5f, 7.27614f, 8.27614f, 7.5f, 8f, 7.5f)
            curveTo(7.72386f, 7.5f, 7.5f, 7.27614f, 7.5f, 7f)
            curveTo(7.5f, 6.72386f, 7.72386f, 6.5f, 8f, 6.5f)
            curveTo(8.27614f, 6.5f, 8.5f, 6.72386f, 8.5f, 7f)
            close()
        }
        }.build()

        return _bitcoinKey!!
    }

private var _bitcoinKey: ImageVector? = null
