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

val HugeIcons.UserDollar: ImageVector
    get() {
        if (_userDollar != null) {
            return _userDollar!!
        }
        _userDollar = ImageVector.Builder(
            name = "UserDollar",
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
            moveTo(12.495f, 13.5663f)
            lineTo(11.5f, 13.5f)
            curveTo(11.1446f, 13.5097f, 10.8134f, 13.5226f, 10.5008f, 13.5379f)
            curveTo(6.8f, 13.7193f, 3.78417f, 16.8058f, 3.5f, 20.5002f)
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
            moveTo(15.5f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 7.5f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 15.5f, 6.5f)
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
            moveTo(20.5f, 14f)
            horizontalLineTo(18f)
            moveTo(15.5f, 20f)
            horizontalLineTo(18f)
            moveTo(18f, 12.5f)
            verticalLineTo(14f)
            moveTo(18f, 14f)
            horizontalLineTo(17f)
            curveTo(16.1716f, 14f, 15.5f, 14.6716f, 15.5f, 15.5f)
            curveTo(15.5f, 16.3284f, 16.1716f, 17f, 17f, 17f)
            horizontalLineTo(19f)
            curveTo(19.8284f, 17f, 20.5f, 17.6716f, 20.5f, 18.5f)
            curveTo(20.5f, 19.3284f, 19.8284f, 20f, 19f, 20f)
            horizontalLineTo(18f)
            moveTo(18f, 21.5f)
            verticalLineTo(20f)
        }
        }.build()

        return _userDollar!!
    }

private var _userDollar: ImageVector? = null
