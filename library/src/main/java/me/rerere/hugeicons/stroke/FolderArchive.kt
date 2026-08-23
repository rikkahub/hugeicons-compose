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

val HugeIcons.FolderArchive: ImageVector
    get() {
        if (_folderArchive != null) {
            return _folderArchive!!
        }
        _folderArchive = ImageVector.Builder(
            name = "FolderArchive",
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
            moveTo(14f, 16.5f)
            verticalLineTo(15f)
            moveTo(14f, 11.5f)
            verticalLineTo(10.5f)
            moveTo(16f, 19f)
            curveTo(16f, 20.1046f, 15.1046f, 21f, 14f, 21f)
            curveTo(12.8954f, 21f, 12f, 20.1046f, 12f, 19f)
            curveTo(12f, 17.8954f, 12.8954f, 17f, 14f, 17f)
            curveTo(15.1046f, 17f, 16f, 17.8954f, 16f, 19f)
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
            moveTo(8f, 7.00447f)
            horizontalLineTo(16.75f)
            curveTo(18.8567f, 7.00447f, 19.91f, 7.00447f, 20.6667f, 7.51062f)
            curveTo(20.9943f, 7.72974f, 21.2755f, 8.01131f, 21.4944f, 8.33925f)
            curveTo(22f, 9.09676f, 22f, 10.1513f, 22f, 12.2603f)
            curveTo(22f, 15.7754f, 22f, 17.5329f, 21.1573f, 18.7955f)
            curveTo(20.7926f, 19.342f, 20.3238f, 19.8113f, 19.7779f, 20.1765f)
            curveTo(19.5391f, 20.3362f, 19.2827f, 20.4657f, 19f, 20.5706f)
            moveTo(12f, 7.00447f)
            lineTo(11.3666f, 5.73618f)
            curveTo(10.8418f, 4.68546f, 10.3622f, 3.62782f, 9.19926f, 3.19122f)
            curveTo(8.6899f, 3f, 8.10802f, 3f, 6.94427f, 3f)
            curveTo(5.1278f, 3f, 4.21956f, 3f, 3.53806f, 3.38074f)
            curveTo(3.05227f, 3.65215f, 2.65142f, 4.05344f, 2.38032f, 4.53978f)
            curveTo(2f, 5.22204f, 2f, 6.13129f, 2f, 7.94979f)
            verticalLineTo(11.0089f)
            curveTo(2f, 15.7282f, 2f, 18.0879f, 3.46447f, 19.554f)
            curveTo(4.5784f, 20.6692f, 6.20875f, 20.9361f, 9f, 21f)
        }
        }.build()

        return _folderArchive!!
    }

private var _folderArchive: ImageVector? = null
