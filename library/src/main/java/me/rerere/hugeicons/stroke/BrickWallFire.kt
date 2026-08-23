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

val HugeIcons.BrickWallFire: ImageVector
    get() {
        if (_brickWallFire != null) {
            return _brickWallFire!!
        }
        _brickWallFire = ImageVector.Builder(
            name = "BrickWallFire",
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
            moveTo(16.2857f, 9f)
            curveTo(17.1193f, 9.76495f, 18.6664f, 13.2366f, 17f, 15.5f)
            curveTo(18.5f, 16f, 20f, 15f, 20.5f, 13.5883f)
            curveTo(21.2864f, 14.3991f, 22f, 16.2403f, 22f, 17.4117f)
            curveTo(22f, 19.946f, 19.7614f, 22f, 17f, 22f)
            curveTo(14.2386f, 22f, 12f, 19.946f, 12f, 17.4117f)
            curveTo(12f, 15.8421f, 12.645f, 14.5517f, 13.6664f, 13.5883f)
            curveTo(14.6893f, 12.6256f, 16.2857f, 11.3229f, 16.2857f, 9f)
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
            moveTo(20.9991f, 10f)
            curveTo(20.99f, 6.8857f, 20.8915f, 5.23467f, 19.8284f, 4.17157f)
            curveTo(18.6569f, 3f, 16.7712f, 3f, 13f, 3f)
            horizontalLineTo(11f)
            curveTo(7.22876f, 3f, 5.34315f, 3f, 4.17157f, 4.17157f)
            curveTo(3f, 5.34315f, 3f, 7.22876f, 3f, 11f)
            verticalLineTo(13f)
            curveTo(3f, 16.7712f, 3f, 18.6569f, 4.17157f, 19.8284f)
            curveTo(5.11466f, 20.7715f, 6.52043f, 20.9554f, 9f, 20.9913f)
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
            moveTo(12f, 9f)
            horizontalLineTo(3f)
            horizontalLineTo(7.5f)
            verticalLineTo(3.5f)
            moveTo(9f, 15f)
            horizontalLineTo(3f)
            horizontalLineTo(7.5f)
            verticalLineTo(20.5f)
            moveTo(16.5f, 3.5f)
            verticalLineTo(6f)
        }
        }.build()

        return _brickWallFire!!
    }

private var _brickWallFire: ImageVector? = null
