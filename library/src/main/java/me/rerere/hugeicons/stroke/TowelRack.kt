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

val HugeIcons.TowelRack: ImageVector
    get() {
        if (_towelRack != null) {
            return _towelRack!!
        }
        _towelRack = ImageVector.Builder(
            name = "TowelRack",
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
            moveTo(2f, 6.5f)
            lineTo(9f, 6.5f)
            moveTo(20f, 6.5f)
            lineTo(22f, 6.5f)
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
            moveTo(9f, 17.5f)
            horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6.5f, 3f)
            horizontalLineTo(15f)
            curveTo(17.357f, 3f, 18.5355f, 3f, 19.2678f, 3.73223f)
            curveTo(20f, 4.46447f, 20f, 5.64298f, 20f, 8f)
            verticalLineTo(17f)
            curveTo(20f, 18.8856f, 20f, 19.8284f, 19.4142f, 20.4142f)
            curveTo(18.8284f, 21f, 17.8856f, 21f, 16f, 21f)
            horizontalLineTo(13f)
            curveTo(11.1144f, 21f, 10.1716f, 21f, 9.58579f, 20.4142f)
            curveTo(9f, 19.8284f, 9f, 18.8856f, 9f, 17f)
            verticalLineTo(15f)
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
            moveTo(3.99999f, 6.5f)
            lineTo(4.00001f, 5.50002f)
            curveTo(4.00003f, 4.11937f, 5.11927f, 3f, 6.49991f, 3f)
            curveTo(7.88055f, 3f, 8.99978f, 4.11924f, 8.99975f, 5.49988f)
            lineTo(8.99957f, 15f)
            horizontalLineTo(6.49968f)
            curveTo(6.03514f, 15f, 5.80287f, 15f, 5.60971f, 14.9616f)
            curveTo(4.81626f, 14.8038f, 4.19599f, 14.1835f, 4.03822f, 13.3901f)
            curveTo(3.99981f, 13.1969f, 3.99981f, 12.9646f, 3.99982f, 12.5001f)
            lineTo(3.99988f, 10f)
        }
        }.build()

        return _towelRack!!
    }

private var _towelRack: ImageVector? = null
