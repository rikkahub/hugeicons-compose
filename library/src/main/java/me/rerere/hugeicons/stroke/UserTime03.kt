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

val HugeIcons.UserTime03: ImageVector
    get() {
        if (_userTime03 != null) {
            return _userTime03!!
        }
        _userTime03 = ImageVector.Builder(
            name = "UserTime03",
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
            moveTo(10.5f, 13f)
            curveTo(10.0671f, 13.0118f, 9.66041f, 13.0238f, 9.27277f, 13.036f)
            curveTo(7.0209f, 13.1069f, 5.89496f, 13.1423f, 5.02924f, 13.5612f)
            curveTo(4.07859f, 14.0213f, 3.32688f, 14.792f, 2.89412f, 15.7504f)
            curveTo(2.50001f, 16.6231f, 2.50001f, 17.7488f, 2.5f, 20f)
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
            moveTo(14.5f, 6f)
            curveTo(14.5f, 8.20914f, 12.7091f, 10f, 10.5f, 10f)
            curveTo(8.29086f, 10f, 6.5f, 8.20914f, 6.5f, 6f)
            curveTo(6.5f, 3.79086f, 8.29086f, 2f, 10.5f, 2f)
            curveTo(12.7091f, 2f, 14.5f, 3.79086f, 14.5f, 6f)
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
            moveTo(18.5f, 18f)
            lineTo(17f, 17.5f)
            verticalLineTo(15.5f)
            moveTo(21.5f, 17.5f)
            curveTo(21.5f, 19.9853f, 19.4853f, 22f, 17f, 22f)
            curveTo(14.5147f, 22f, 12.5f, 19.9853f, 12.5f, 17.5f)
            curveTo(12.5f, 15.0147f, 14.5147f, 13f, 17f, 13f)
            curveTo(19.4853f, 13f, 21.5f, 15.0147f, 21.5f, 17.5f)
            close()
        }
        }.build()

        return _userTime03!!
    }

private var _userTime03: ImageVector? = null
