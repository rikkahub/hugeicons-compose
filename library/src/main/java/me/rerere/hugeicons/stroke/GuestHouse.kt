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

val HugeIcons.GuestHouse: ImageVector
    get() {
        if (_guestHouse != null) {
            return _guestHouse!!
        }
        _guestHouse = ImageVector.Builder(
            name = "GuestHouse",
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
            moveTo(4f, 8f)
            verticalLineTo(16f)
            curveTo(4f, 18.357f, 4f, 19.5355f, 4.73223f, 20.2678f)
            curveTo(5.46447f, 21f, 6.64298f, 21f, 9f, 21f)
            horizontalLineTo(15f)
            curveTo(17.357f, 21f, 18.5355f, 21f, 19.2678f, 20.2678f)
            curveTo(20f, 19.5355f, 20f, 18.357f, 20f, 16f)
            verticalLineTo(4f)
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
            moveTo(9f, 21f)
            verticalLineTo(17f)
            curveTo(9f, 15.3431f, 10.3431f, 14f, 12f, 14f)
            curveTo(13.6569f, 14f, 15f, 15.3431f, 15f, 17f)
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
            moveTo(22f, 9f)
            lineTo(15.2699f, 4.56779f)
            curveTo(13.6829f, 3.5226f, 12.8893f, 3f, 12f, 3f)
            curveTo(11.1107f, 3f, 10.3171f, 3.5226f, 8.73007f, 4.56779f)
            lineTo(2f, 9f)
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
            moveTo(12.125f, 9.25f)
            horizontalLineTo(12f)
            moveTo(12.25f, 9.25f)
            curveTo(12.25f, 9.38807f, 12.1381f, 9.5f, 12f, 9.5f)
            curveTo(11.8619f, 9.5f, 11.75f, 9.38807f, 11.75f, 9.25f)
            curveTo(11.75f, 9.11193f, 11.8619f, 9f, 12f, 9f)
            curveTo(12.1381f, 9f, 12.25f, 9.11193f, 12.25f, 9.25f)
            close()
        }
        }.build()

        return _guestHouse!!
    }

private var _guestHouse: ImageVector? = null
