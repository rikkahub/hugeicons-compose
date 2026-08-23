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

val HugeIcons.FolderSync: ImageVector
    get() {
        if (_folderSync != null) {
            return _folderSync!!
        }
        _folderSync = ImageVector.Builder(
            name = "FolderSync",
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
            moveTo(8.00164f, 6.50013f)
            horizontalLineTo(16.754f)
            curveTo(18.8613f, 6.50013f, 19.9149f, 6.50013f, 20.6718f, 7.00574f)
            curveTo(20.9995f, 7.22462f, 21.2808f, 7.50588f, 21.4997f, 7.83346f)
            curveTo(21.8937f, 8.42301f, 21.9808f, 9.19265f, 22f, 10.5003f)
            moveTo(12.0027f, 6.50013f)
            lineTo(11.3691f, 5.23321f)
            curveTo(10.8442f, 4.18363f, 10.3645f, 3.12714f, 9.20122f, 2.69101f)
            curveTo(8.69172f, 2.5f, 8.10969f, 2.5f, 6.94562f, 2.5f)
            curveTo(5.12865f, 2.5f, 4.22017f, 2.5f, 3.53848f, 2.88033f)
            curveTo(3.05255f, 3.15144f, 2.6516f, 3.5523f, 2.38042f, 4.03811f)
            curveTo(2f, 4.71963f, 2f, 5.6279f, 2f, 7.44443f)
            verticalLineTo(10.5003f)
            curveTo(2f, 15.2145f, 2f, 17.5716f, 3.46487f, 19.0361f)
            curveTo(4.82227f, 20.3931f, 6.94628f, 20.4927f, 11.0025f, 20.5f)
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
            moveTo(21.4649f, 15f)
            curveTo(20.7733f, 13.8044f, 19.4806f, 13f, 18f, 13f)
            curveTo(16.4726f, 13f, 15.1451f, 13.8561f, 14.4713f, 15.1147f)
            moveTo(14.5351f, 19f)
            curveTo(15.2267f, 20.1956f, 16.5194f, 21f, 18f, 21f)
            curveTo(19.5227f, 21f, 20.8467f, 20.1492f, 21.5224f, 18.897f)
            moveTo(17f, 15.5f)
            horizontalLineTo(16f)
            curveTo(15.0572f, 15.5f, 14.5858f, 15.5f, 14.2929f, 15.2071f)
            curveTo(14f, 14.9142f, 14f, 14.4428f, 14f, 13.5f)
            verticalLineTo(12.5f)
            moveTo(19f, 18.5f)
            horizontalLineTo(20f)
            curveTo(20.9428f, 18.5f, 21.4142f, 18.5f, 21.7071f, 18.7929f)
            curveTo(22f, 19.0858f, 22f, 19.5572f, 22f, 20.5f)
            verticalLineTo(21.5f)
        }
        }.build()

        return _folderSync!!
    }

private var _folderSync: ImageVector? = null
