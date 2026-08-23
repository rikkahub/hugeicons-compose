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

val HugeIcons.FolderCog: ImageVector
    get() {
        if (_folderCog != null) {
            return _folderCog!!
        }
        _folderCog = ImageVector.Builder(
            name = "FolderCog",
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
            moveTo(8f, 6.5f)
            horizontalLineTo(16.75f)
            curveTo(18.8567f, 6.5f, 19.91f, 6.5f, 20.6667f, 7.00559f)
            curveTo(20.9943f, 7.22447f, 21.2755f, 7.50572f, 21.4944f, 7.83329f)
            curveTo(21.9361f, 8.4943f, 21.9919f, 9.38172f, 21.999f, 11f)
            moveTo(12f, 6.5f)
            lineTo(11.3666f, 5.23313f)
            curveTo(10.8418f, 4.18358f, 10.3622f, 3.12712f, 9.19926f, 2.69101f)
            curveTo(8.6899f, 2.5f, 8.10802f, 2.5f, 6.94427f, 2.5f)
            curveTo(5.1278f, 2.5f, 4.21956f, 2.5f, 3.53806f, 2.88032f)
            curveTo(3.05227f, 3.15142f, 2.65142f, 3.55227f, 2.38032f, 4.03806f)
            curveTo(2f, 4.71956f, 2f, 5.6278f, 2f, 7.44427f)
            verticalLineTo(10.5f)
            curveTo(2f, 15.214f, 2f, 17.5711f, 3.46447f, 19.0355f)
            curveTo(4.8215f, 20.3926f, 6.94493f, 20.4921f, 11f, 20.4994f)
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
            moveTo(20.5f, 17.5f)
            curveTo(20.5f, 18.8807f, 19.3807f, 20f, 18f, 20f)
            moveTo(20.5f, 17.5f)
            curveTo(20.5f, 16.1193f, 19.3807f, 15f, 18f, 15f)
            moveTo(20.5f, 17.5f)
            horizontalLineTo(22f)
            moveTo(18f, 20f)
            curveTo(16.6193f, 20f, 15.5f, 18.8807f, 15.5f, 17.5f)
            moveTo(18f, 20f)
            verticalLineTo(21.5f)
            moveTo(15.5f, 17.5f)
            curveTo(15.5f, 16.1193f, 16.6193f, 15f, 18f, 15f)
            moveTo(15.5f, 17.5f)
            horizontalLineTo(14f)
            moveTo(18f, 15f)
            verticalLineTo(13.5f)
            moveTo(19.7678f, 15.7322f)
            lineTo(20.8284f, 14.6716f)
            moveTo(16.2322f, 19.2678f)
            lineTo(15.1716f, 20.3284f)
            moveTo(19.7678f, 19.2678f)
            lineTo(20.8284f, 20.3284f)
            moveTo(16.2322f, 15.7322f)
            lineTo(15.1716f, 14.6716f)
        }
        }.build()

        return _folderCog!!
    }

private var _folderCog: ImageVector? = null
