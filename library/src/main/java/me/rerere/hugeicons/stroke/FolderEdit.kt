package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderEdit: ImageVector
    get() {
        if (_folderEdit != null) {
            return _folderEdit!!
        }
        _folderEdit = ImageVector.Builder(
            name = "FolderEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00164f, 7.00013f)
        horizontalLineTo(16.754f)
        curveTo(18.8613f, 7.00013f, 19.9149f, 7.00013f, 20.6718f, 7.50574f)
        curveTo(20.9995f, 7.72462f, 21.2808f, 8.00588f, 21.4997f, 8.33346f)
        curveTo(21.8937f, 8.92301f, 21.9808f, 9.69265f, 22f, 11.0003f)
        moveTo(12.0027f, 7.00013f)
        lineTo(11.3691f, 5.73321f)
        curveTo(10.8442f, 4.68363f, 10.3645f, 3.62714f, 9.20122f, 3.19101f)
        curveTo(8.69172f, 3f, 8.10969f, 3f, 6.94562f, 3f)
        curveTo(5.12865f, 3f, 4.22017f, 3f, 3.53848f, 3.38033f)
        curveTo(3.05255f, 3.65144f, 2.6516f, 4.0523f, 2.38042f, 4.53811f)
        curveTo(2f, 5.21963f, 2f, 6.1279f, 2f, 7.94443f)
        verticalLineTo(11.0003f)
        curveTo(2f, 15.7145f, 2f, 18.0716f, 3.46487f, 19.5361f)
        curveTo(4.82227f, 20.8931f, 6.94628f, 20.9927f, 11.0025f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 19.8268f)
        verticalLineTo(21f)
        horizontalLineTo(15.1734f)
        curveTo(15.5827f, 21f, 15.7874f, 21f, 15.9715f, 20.9238f)
        curveTo(16.1555f, 20.8475f, 16.3003f, 20.7028f, 16.5897f, 20.4134f)
        lineTo(21.4133f, 15.5894f)
        curveTo(21.6864f, 15.3164f, 21.8229f, 15.1799f, 21.8959f, 15.0327f)
        curveTo(22.0347f, 14.7525f, 22.0347f, 14.4236f, 21.8959f, 14.1434f)
        curveTo(21.8229f, 13.9961f, 21.6864f, 13.8596f, 21.4133f, 13.5866f)
        curveTo(21.1403f, 13.3136f, 21.0038f, 13.1771f, 20.8565f, 13.1041f)
        curveTo(20.5763f, 12.9653f, 20.2473f, 12.9653f, 19.9671f, 13.1041f)
        curveTo(19.8198f, 13.1771f, 19.6833f, 13.3136f, 19.4103f, 13.5866f)
        lineTo(19.4103f, 13.5866f)
        lineTo(14.5867f, 18.4106f)
        curveTo(14.2972f, 18.7f, 14.1525f, 18.8447f, 14.0762f, 19.0287f)
        curveTo(14f, 19.2128f, 14f, 19.4174f, 14f, 19.8268f)
        }
        }.build()

        return _folderEdit!!
    }

private var _folderEdit: ImageVector? = null
