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

val HugeIcons.Progress: ImageVector
    get() {
        if (_progress != null) {
            return _progress!!
        }
        _progress = ImageVector.Builder(
            name = "Progress",
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
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
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
            moveTo(12f, 6f)
            curveTo(13.0532f, 6f, 14.0879f, 6.27724f, 15f, 6.80385f)
            curveTo(15.9121f, 7.33046f, 16.6695f, 8.08788f, 17.1962f, 9f)
            curveTo(17.7228f, 9.91212f, 18f, 10.9468f, 18f, 12f)
            curveTo(18f, 13.0532f, 17.7228f, 14.0879f, 17.1962f, 15f)
            curveTo(16.6695f, 15.9121f, 15.9121f, 16.6695f, 15f, 17.1962f)
            curveTo(14.0879f, 17.7228f, 13.0532f, 18f, 12f, 18f)
            curveTo(10.9468f, 18f, 9.91211f, 17.7228f, 9f, 17.1962f)
            curveTo(8.08788f, 16.6695f, 7.33046f, 15.9121f, 6.80385f, 15f)
            lineTo(12f, 12f)
            lineTo(12f, 6f)
            close()
        }
        }.build()

        return _progress!!
    }

private var _progress: ImageVector? = null
