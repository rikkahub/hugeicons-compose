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

val HugeIcons.FolderHeart: ImageVector
    get() {
        if (_folderHeart != null) {
            return _folderHeart!!
        }
        _folderHeart = ImageVector.Builder(
            name = "FolderHeart",
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
            moveTo(12f, 20.5f)
            curveTo(7.28595f, 20.5f, 4.92893f, 20.5f, 3.46447f, 19.0355f)
            curveTo(2f, 17.5711f, 2f, 15.214f, 2f, 10.5f)
            verticalLineTo(7.44427f)
            curveTo(2f, 5.6278f, 2f, 4.71956f, 2.38032f, 4.03806f)
            curveTo(2.65142f, 3.55227f, 3.05227f, 3.15142f, 3.53806f, 2.88032f)
            curveTo(4.21956f, 2.5f, 5.1278f, 2.5f, 6.94427f, 2.5f)
            curveTo(8.10802f, 2.5f, 8.6899f, 2.5f, 9.19926f, 2.69101f)
            curveTo(10.3622f, 3.12712f, 10.8418f, 4.18358f, 11.3666f, 5.23313f)
            lineTo(12f, 6.5f)
            moveTo(8f, 6.5f)
            horizontalLineTo(16.75f)
            curveTo(18.8567f, 6.5f, 19.91f, 6.5f, 20.6667f, 7.00559f)
            curveTo(20.9943f, 7.22447f, 21.2755f, 7.50572f, 21.4944f, 7.83329f)
            curveTo(21.9796f, 8.55942f, 21.9992f, 9.55876f, 22f, 11.5f)
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
            moveTo(17.3643f, 21.2808f)
            curveTo(16.2358f, 20.4121f, 14f, 18.4261f, 14f, 16.6389f)
            curveTo(14f, 15.4576f, 14.8421f, 14.5f, 16f, 14.5f)
            curveTo(16.6f, 14.5f, 17.2f, 14.7059f, 18f, 15.5294f)
            curveTo(18.8f, 14.7059f, 19.4f, 14.5f, 20f, 14.5f)
            curveTo(21.1579f, 14.5f, 22f, 15.4576f, 22f, 16.6389f)
            curveTo(22f, 18.4261f, 19.7642f, 20.4121f, 18.6357f, 21.2808f)
            curveTo(18.256f, 21.5731f, 17.744f, 21.5731f, 17.3643f, 21.2808f)
            close()
        }
        }.build()

        return _folderHeart!!
    }

private var _folderHeart: ImageVector? = null
