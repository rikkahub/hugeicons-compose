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

val HugeIcons.FolderKey: ImageVector
    get() {
        if (_folderKey != null) {
            return _folderKey!!
        }
        _folderKey = ImageVector.Builder(
            name = "FolderKey",
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
            moveTo(8.01332f, 6.50116f)
            horizontalLineTo(16.7827f)
            curveTo(18.8941f, 6.50116f, 19.9498f, 6.50116f, 20.7081f, 7.0069f)
            curveTo(21.0364f, 7.22584f, 21.3183f, 7.50717f, 21.5377f, 7.83484f)
            curveTo(21.8193f, 8.25555f, 21.9444f, 8.76795f, 22f, 9.50203f)
            moveTo(12.0222f, 6.50116f)
            lineTo(11.3874f, 5.23392f)
            curveTo(10.8614f, 4.18406f, 10.3808f, 3.1273f, 9.21524f, 2.69106f)
            curveTo(8.70475f, 2.5f, 8.12158f, 2.5f, 6.95525f, 2.5f)
            curveTo(5.13474f, 2.5f, 4.22449f, 2.5f, 3.54148f, 2.88043f)
            curveTo(3.0546f, 3.15161f, 2.65287f, 3.55257f, 2.38116f, 4.03851f)
            curveTo(2f, 4.72021f, 2f, 5.62871f, 2f, 7.44571f)
            verticalLineTo(10.5023f)
            curveTo(2f, 15.2177f, 2f, 17.5754f, 3.46772f, 19.0403f)
            curveTo(4.71129f, 20.2815f, 6.59706f, 20.4711f, 10.0178f, 20.5f)
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
            moveTo(17.5f, 18f)
            lineTo(22f, 13.5f)
            moveTo(21f, 15f)
            lineTo(22f, 16f)
            moveTo(18f, 19.5f)
            curveTo(18f, 20.6046f, 17.1046f, 21.5f, 16f, 21.5f)
            curveTo(14.8954f, 21.5f, 14f, 20.6046f, 14f, 19.5f)
            curveTo(14f, 18.3954f, 14.8954f, 17.5f, 16f, 17.5f)
            curveTo(17.1046f, 17.5f, 18f, 18.3954f, 18f, 19.5f)
            close()
        }
        }.build()

        return _folderKey!!
    }

private var _folderKey: ImageVector? = null
