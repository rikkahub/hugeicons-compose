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

val HugeIcons.FolderInput: ImageVector
    get() {
        if (_folderInput != null) {
            return _folderInput!!
        }
        _folderInput = ImageVector.Builder(
            name = "FolderInput",
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
            moveTo(8f, 7f)
            horizontalLineTo(12f)
            moveTo(12f, 7f)
            horizontalLineTo(16.75f)
            curveTo(18.8567f, 7f, 19.91f, 7f, 20.6667f, 7.50559f)
            curveTo(20.9943f, 7.72447f, 21.2755f, 8.00572f, 21.4944f, 8.33329f)
            curveTo(22f, 9.08996f, 22f, 10.1433f, 22f, 12.25f)
            curveTo(22f, 15.7612f, 22f, 17.5167f, 21.1573f, 18.7779f)
            curveTo(20.7926f, 19.3238f, 20.3238f, 19.7926f, 19.7779f, 20.1573f)
            curveTo(18.5167f, 21f, 16.7612f, 21f, 13.25f, 21f)
            horizontalLineTo(12f)
            curveTo(7.28595f, 21f, 4.92893f, 21f, 3.46447f, 19.5355f)
            curveTo(3.03965f, 19.1107f, 2.73806f, 18.6108f, 2.52396f, 18f)
            moveTo(12f, 7f)
            lineTo(11.3666f, 5.73313f)
            curveTo(10.8418f, 4.68358f, 10.3622f, 3.62712f, 9.19926f, 3.19101f)
            curveTo(8.6899f, 3f, 8.10802f, 3f, 6.94427f, 3f)
            curveTo(5.1278f, 3f, 4.21956f, 3f, 3.53806f, 3.38032f)
            curveTo(3.05227f, 3.65142f, 2.65142f, 4.05227f, 2.38032f, 4.53806f)
            curveTo(2f, 5.21956f, 2f, 6.1278f, 2f, 7.94427f)
            verticalLineTo(10f)
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
            moveTo(9.00002f, 17f)
            curveTo(9.00002f, 17f, 12f, 14.7905f, 12f, 14f)
            curveTo(12f, 13.2094f, 9f, 11f, 9f, 11f)
            moveTo(11f, 14f)
            lineTo(2f, 14f)
        }
        }.build()

        return _folderInput!!
    }

private var _folderInput: ImageVector? = null
