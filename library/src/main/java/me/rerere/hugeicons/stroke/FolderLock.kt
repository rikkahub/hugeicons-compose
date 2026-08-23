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

val HugeIcons.FolderLock: ImageVector
    get() {
        if (_folderLock != null) {
            return _folderLock!!
        }
        _folderLock = ImageVector.Builder(
            name = "FolderLock",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21.9946f, 10.5f)
            curveTo(21.9753f, 9.19244f, 21.8883f, 8.42282f, 21.4944f, 7.83329f)
            curveTo(21.2755f, 7.50572f, 20.9943f, 7.22447f, 20.6667f, 7.00559f)
            curveTo(19.91f, 6.5f, 18.8567f, 6.5f, 16.75f, 6.5f)
            horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
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
            moveTo(20.5f, 17f)
            verticalLineTo(15.5f)
            curveTo(20.5f, 14.3954f, 19.6046f, 13.5f, 18.5f, 13.5f)
            curveTo(17.3954f, 13.5f, 16.5f, 14.3954f, 16.5f, 15.5f)
            verticalLineTo(17f)
            moveTo(20.5f, 17f)
            horizontalLineTo(16.5f)
            moveTo(20.5f, 17f)
            curveTo(21.3284f, 17f, 22f, 17.6716f, 22f, 18.5f)
            verticalLineTo(19.25f)
            curveTo(22f, 19.9489f, 22f, 20.2984f, 21.8858f, 20.574f)
            curveTo(21.7336f, 20.9416f, 21.4416f, 21.2336f, 21.074f, 21.3858f)
            curveTo(20.7984f, 21.5f, 20.4489f, 21.5f, 19.75f, 21.5f)
            horizontalLineTo(17.25f)
            curveTo(16.5511f, 21.5f, 16.2016f, 21.5f, 15.926f, 21.3858f)
            curveTo(15.5584f, 21.2336f, 15.2664f, 20.9416f, 15.1142f, 20.574f)
            curveTo(15f, 20.2984f, 15f, 19.9489f, 15f, 19.25f)
            verticalLineTo(18.5f)
            curveTo(15f, 17.6716f, 15.6716f, 17f, 16.5f, 17f)
        }
        }.build()

        return _folderLock!!
    }

private var _folderLock: ImageVector? = null
