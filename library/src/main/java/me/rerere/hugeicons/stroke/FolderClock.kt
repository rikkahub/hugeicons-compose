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

val HugeIcons.FolderClock: ImageVector
    get() {
        if (_folderClock != null) {
            return _folderClock!!
        }
        _folderClock = ImageVector.Builder(
            name = "FolderClock",
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
            moveTo(22f, 16.5f)
            arcTo(5f, 5f, 0f, true, false, 12f, 16.5f)
            arcTo(5f, 5f, 0f, true, false, 22f, 16.5f)
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
            moveTo(17f, 14.5f)
            verticalLineTo(16.5f)
            lineTo(18.5f, 17f)
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
            moveTo(8.01332f, 6.50447f)
            horizontalLineTo(16.7827f)
            curveTo(18.8941f, 6.50447f, 19.9498f, 6.50447f, 20.7081f, 7.01062f)
            curveTo(21.0364f, 7.22974f, 21.3183f, 7.51131f, 21.5377f, 7.83925f)
            curveTo(21.8193f, 8.26031f, 21.9444f, 8.77313f, 22f, 9.50782f)
            moveTo(12.0222f, 6.50447f)
            lineTo(11.3874f, 5.23618f)
            curveTo(10.8614f, 4.18546f, 10.3808f, 3.12782f, 9.21524f, 2.69122f)
            curveTo(8.70475f, 2.5f, 8.12158f, 2.5f, 6.95525f, 2.5f)
            curveTo(5.13474f, 2.5f, 4.22449f, 2.5f, 3.54148f, 2.88074f)
            curveTo(3.0546f, 3.15215f, 2.65287f, 3.55344f, 2.38116f, 4.03978f)
            curveTo(2f, 4.72204f, 2f, 5.63129f, 2f, 7.44979f)
            verticalLineTo(10.5089f)
            curveTo(2f, 15.2282f, 2f, 17.5879f, 3.46772f, 19.054f)
            curveTo(4.58412f, 20.1692f, 6.21809f, 20.4361f, 9.01554f, 20.5f)
        }
        }.build()

        return _folderClock!!
    }

private var _folderClock: ImageVector? = null
