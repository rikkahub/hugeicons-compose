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

val HugeIcons.BrickWallShield: ImageVector
    get() {
        if (_brickWallShield != null) {
            return _brickWallShield!!
        }
        _brickWallShield = ImageVector.Builder(
            name = "BrickWallShield",
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
            moveTo(10.5f, 20.5f)
            curveTo(6.72876f, 20.5f, 4.84315f, 20.5f, 3.67157f, 19.3284f)
            curveTo(2.5f, 18.1569f, 2.5f, 16.2712f, 2.5f, 12.5f)
            verticalLineTo(10.5f)
            curveTo(2.5f, 6.72876f, 2.5f, 4.84315f, 3.67157f, 3.67157f)
            curveTo(4.84315f, 2.5f, 6.72876f, 2.5f, 10.5f, 2.5f)
            horizontalLineTo(12.5f)
            curveTo(16.2712f, 2.5f, 18.1569f, 2.5f, 19.3284f, 3.67157f)
            curveTo(20.3886f, 4.73177f, 20.4894f, 5.5578f, 20.499f, 8.5f)
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
            moveTo(11.5f, 8.5f)
            horizontalLineTo(2.5f)
            horizontalLineTo(7f)
            moveTo(11.5f, 8.5f)
            horizontalLineTo(20.5f)
            horizontalLineTo(16f)
            moveTo(11.5f, 8.5f)
            verticalLineTo(10.5f)
            moveTo(9.5f, 14.5f)
            horizontalLineTo(2.5f)
            horizontalLineTo(7f)
            verticalLineTo(20f)
            moveTo(7f, 3f)
            verticalLineTo(8.5f)
            moveTo(7f, 8.5f)
            horizontalLineTo(16f)
            moveTo(16f, 3f)
            verticalLineTo(8.5f)
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
            moveTo(20.4817f, 13.1729f)
            curveTo(19.6407f, 12.7492f, 18.6115f, 12.5f, 17.5f, 12.5f)
            curveTo(16.3885f, 12.5f, 15.3593f, 12.7492f, 14.5183f, 13.1729f)
            curveTo(14.1059f, 13.3807f, 13.8996f, 13.4846f, 13.6998f, 13.8112f)
            curveTo(13.5f, 14.1378f, 13.5f, 14.4541f, 13.5f, 15.0867f)
            verticalLineTo(16.6567f)
            curveTo(13.5f, 19.2142f, 15.5188f, 20.6362f, 16.688f, 21.2452f)
            curveTo(17.0141f, 21.4151f, 17.1771f, 21.5f, 17.5f, 21.5f)
            curveTo(17.8229f, 21.5f, 17.9859f, 21.4151f, 18.312f, 21.2452f)
            curveTo(19.4812f, 20.6362f, 21.5f, 19.2142f, 21.5f, 16.6567f)
            lineTo(21.5f, 15.0867f)
            curveTo(21.5f, 14.4541f, 21.5f, 14.1378f, 21.3002f, 13.8112f)
            curveTo(21.1004f, 13.4846f, 20.8941f, 13.3807f, 20.4817f, 13.1729f)
            close()
        }
        }.build()

        return _brickWallShield!!
    }

private var _brickWallShield: ImageVector? = null
