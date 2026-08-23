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

val HugeIcons.UserShield01: ImageVector
    get() {
        if (_userShield01 != null) {
            return _userShield01!!
        }
        _userShield01 = ImageVector.Builder(
            name = "UserShield01",
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
            moveTo(11.995f, 13.5663f)
            lineTo(11f, 13.5f)
            curveTo(10.6446f, 13.5097f, 10.3134f, 13.5226f, 10.0008f, 13.5379f)
            curveTo(6.3f, 13.7193f, 3.28417f, 16.8058f, 3f, 20.5002f)
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
            moveTo(15f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 7f, 6.5f)
            arcTo(4f, 4f, 0f, true, false, 15f, 6.5f)
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
            moveTo(21f, 17.4697f)
            verticalLineTo(16.24f)
            curveTo(21f, 15.668f, 20.5482f, 15.2123f, 20.0057f, 15.1055f)
            curveTo(19.4321f, 14.9926f, 18.9467f, 14.8018f, 18.5972f, 14.6341f)
            curveTo(18.2246f, 14.4553f, 17.7754f, 14.4553f, 17.4028f, 14.6341f)
            curveTo(17.0533f, 14.8018f, 16.5679f, 14.9926f, 15.9943f, 15.1055f)
            curveTo(15.4518f, 15.2123f, 15f, 15.668f, 15f, 16.24f)
            verticalLineTo(17.4697f)
            curveTo(15f, 20.0501f, 16.986f, 21.1308f, 17.7262f, 21.444f)
            curveTo(17.9026f, 21.5187f, 18.0974f, 21.5187f, 18.2738f, 21.444f)
            curveTo(19.014f, 21.1308f, 21f, 20.0501f, 21f, 17.4697f)
            close()
        }
        }.build()

        return _userShield01!!
    }

private var _userShield01: ImageVector? = null
