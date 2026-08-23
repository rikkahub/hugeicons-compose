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

val HugeIcons.UserRoundPlus: ImageVector
    get() {
        if (_userRoundPlus != null) {
            return _userRoundPlus!!
        }
        _userRoundPlus = ImageVector.Builder(
            name = "UserRoundPlus",
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
            moveTo(15f, 8f)
            curveTo(15f, 5.23858f, 12.7614f, 3f, 10f, 3f)
            curveTo(7.23858f, 3f, 5f, 5.23858f, 5f, 8f)
            curveTo(5f, 10.7614f, 7.23858f, 13f, 10f, 13f)
            curveTo(12.7614f, 13f, 15f, 10.7614f, 15f, 8f)
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
            moveTo(17.5f, 21f)
            lineTo(17.5f, 14f)
            moveTo(14f, 17.5f)
            horizontalLineTo(21f)
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
            moveTo(3f, 20f)
            curveTo(3f, 16.134f, 6.13401f, 13f, 10f, 13f)
            curveTo(11.4872f, 13f, 12.8662f, 13.4638f, 14f, 14.2547f)
        }
        }.build()

        return _userRoundPlus!!
    }

private var _userRoundPlus: ImageVector? = null
