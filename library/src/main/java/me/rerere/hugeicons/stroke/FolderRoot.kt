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

val HugeIcons.FolderRoot: ImageVector
    get() {
        if (_folderRoot != null) {
            return _folderRoot!!
        }
        _folderRoot = ImageVector.Builder(
            name = "FolderRoot",
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
            moveTo(12f, 16f)
            curveTo(13.1046f, 16f, 14f, 15.1046f, 14f, 14f)
            curveTo(14f, 12.8954f, 13.1046f, 12f, 12f, 12f)
            curveTo(10.8954f, 12f, 10f, 12.8954f, 10f, 14f)
            curveTo(10f, 15.1046f, 10.8954f, 16f, 12f, 16f)
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
            moveTo(12f, 16f)
            verticalLineTo(21f)
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
            moveTo(8f, 7f)
            horizontalLineTo(16.75f)
            curveTo(18.8567f, 7f, 19.91f, 7f, 20.6667f, 7.50559f)
            curveTo(20.9943f, 7.72447f, 21.2755f, 8.00572f, 21.4944f, 8.33329f)
            curveTo(22f, 9.08996f, 22f, 10.1433f, 22f, 12.25f)
            curveTo(22f, 15.7612f, 22f, 17.5167f, 21.1573f, 18.7779f)
            curveTo(20.7926f, 19.3238f, 20.3238f, 19.7926f, 19.7779f, 20.1573f)
            curveTo(18.5167f, 21f, 16.7612f, 21f, 13.25f, 21f)
            horizontalLineTo(12f)
            curveTo(7.28595f, 21f, 4.92893f, 21f, 3.46447f, 19.5355f)
            curveTo(2f, 18.0711f, 2f, 15.714f, 2f, 11f)
            verticalLineTo(7.94427f)
            curveTo(2f, 6.1278f, 2f, 5.21956f, 2.38032f, 4.53806f)
            curveTo(2.65142f, 4.05227f, 3.05227f, 3.65142f, 3.53806f, 3.38032f)
            curveTo(4.21956f, 3f, 5.1278f, 3f, 6.94427f, 3f)
            curveTo(8.10802f, 3f, 8.6899f, 3f, 9.19926f, 3.19101f)
            curveTo(10.3622f, 3.62712f, 10.8418f, 4.68358f, 11.3666f, 5.73313f)
            lineTo(12f, 7f)
        }
        }.build()

        return _folderRoot!!
    }

private var _folderRoot: ImageVector? = null
