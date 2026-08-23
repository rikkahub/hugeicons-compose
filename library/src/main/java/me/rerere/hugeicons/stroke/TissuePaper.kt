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

val HugeIcons.TissuePaper: ImageVector
    get() {
        if (_tissuePaper != null) {
            return _tissuePaper!!
        }
        _tissuePaper = ImageVector.Builder(
            name = "TissuePaper",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10f, 9.5f)
            curveTo(10f, 12.5376f, 8.20914f, 15f, 6f, 15f)
            curveTo(3.79086f, 15f, 2f, 12.5376f, 2f, 9.5f)
            curveTo(2f, 6.46243f, 3.79086f, 4f, 6f, 4f)
            curveTo(8.20914f, 4f, 10f, 6.46243f, 10f, 9.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21.8127f, 10.6943f)
            curveTo(21.9339f, 10.1652f, 22f, 9.59475f, 22f, 9f)
            curveTo(22f, 6.23858f, 20.5755f, 4f, 18.8182f, 4f)
            lineTo(6f, 4f)
            curveTo(9.15512f, 4f, 10.5704f, 7.955f, 10.0225f, 10.5666f)
            curveTo(9.45596f, 13.2674f, 7.17947f, 16.369f, 7.38872f, 19.1311f)
            curveTo(7.42593f, 19.6223f, 7.79914f, 20f, 8.24715f, 20f)
            horizontalLineTo(18.3605f)
            curveTo(18.8516f, 20f, 19.2378f, 19.5383f, 19.197f, 19f)
            curveTo(18.9931f, 16.3084f, 21.2125f, 13.3133f, 21.8127f, 10.6943f)
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
            moveTo(6.125f, 9.5f)
            horizontalLineTo(6f)
            moveTo(6.25f, 9.5f)
            curveTo(6.25f, 9.63807f, 6.13807f, 9.75f, 6f, 9.75f)
            curveTo(5.86193f, 9.75f, 5.75f, 9.63807f, 5.75f, 9.5f)
            curveTo(5.75f, 9.36193f, 5.86193f, 9.25f, 6f, 9.25f)
            curveTo(6.13807f, 9.25f, 6.25f, 9.36193f, 6.25f, 9.5f)
            close()
        }
        }.build()

        return _tissuePaper!!
    }

private var _tissuePaper: ImageVector? = null
