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

val HugeIcons.FileScan: ImageVector
    get() {
        if (_fileScan != null) {
            return _fileScan!!
        }
        _fileScan = ImageVector.Builder(
            name = "FileScan",
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
            moveTo(14f, 22f)
            curveTo(12.8954f, 22f, 12f, 21.1046f, 12f, 20f)
            moveTo(18f, 22f)
            curveTo(19.1046f, 22f, 20f, 21.1046f, 20f, 20f)
            moveTo(14f, 14f)
            curveTo(12.8954f, 14f, 12f, 14.8954f, 12f, 16f)
            moveTo(18f, 14f)
            curveTo(19.1046f, 14f, 20f, 14.8954f, 20f, 16f)
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
            moveTo(13f, 2.5f)
            verticalLineTo(3f)
            curveTo(13f, 5.82843f, 13f, 7.24264f, 13.8787f, 8.12132f)
            curveTo(14.7574f, 9f, 16.1716f, 9f, 19f, 9f)
            horizontalLineTo(19.5f)
            moveTo(20f, 10.5f)
            curveTo(19.9993f, 9.7855f, 19.9899f, 9.40631f, 19.8478f, 9.06306f)
            curveTo(19.6955f, 8.69552f, 19.4065f, 8.40649f, 18.8284f, 7.82843f)
            lineTo(14.0919f, 3.09188f)
            curveTo(13.593f, 2.593f, 13.3436f, 2.34355f, 13.0345f, 2.19575f)
            curveTo(12.9702f, 2.165f, 12.9044f, 2.13772f, 12.8372f, 2.11401f)
            curveTo(12.5141f, 2f, 12.1614f, 2f, 11.4558f, 2f)
            curveTo(8.21082f, 2f, 6.58831f, 2f, 5.48933f, 2.88607f)
            curveTo(5.26731f, 3.06508f, 5.06508f, 3.26731f, 4.88607f, 3.48933f)
            curveTo(4f, 4.58831f, 4f, 6.21082f, 4f, 9.45584f)
            verticalLineTo(14.1015f)
            curveTo(4f, 17.8727f, 4f, 19.7583f, 5.17157f, 20.9299f)
            curveTo(5.82475f, 21.5831f, 6.69989f, 21.8721f, 8f, 22f)
        }
        }.build()

        return _fileScan!!
    }

private var _fileScan: ImageVector? = null
