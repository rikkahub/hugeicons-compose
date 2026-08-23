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

val HugeIcons.Anvil: ImageVector
    get() {
        if (_anvil != null) {
            return _anvil!!
        }
        _anvil = ImageVector.Builder(
            name = "Anvil",
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
            moveTo(7f, 7.5f)
            verticalLineTo(5.5f)
            curveTo(7f, 4.55719f, 7f, 4.08579f, 7.29289f, 3.79289f)
            curveTo(7.58579f, 3.5f, 8.05719f, 3.5f, 9f, 3.5f)
            horizontalLineTo(21f)
            curveTo(21.5523f, 3.5f, 22f, 3.94772f, 22f, 4.5f)
            curveTo(22f, 8.36599f, 18.866f, 11.5f, 15f, 11.5f)
            horizontalLineTo(11f)
            curveTo(9.11438f, 11.5f, 8.17157f, 11.5f, 7.58579f, 10.9142f)
            curveTo(7f, 10.3284f, 7f, 9.38562f, 7f, 7.5f)
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
            moveTo(7f, 4.5f)
            horizontalLineTo(3f)
            curveTo(2.44772f, 4.5f, 2f, 4.94772f, 2f, 5.5f)
            curveTo(2f, 7.70914f, 3.79086f, 9.5f, 6f, 9.5f)
            horizontalLineTo(7f)
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
            moveTo(16f, 11.5f)
            verticalLineTo(13.5f)
            curveTo(16f, 15.1569f, 17.3431f, 16.5f, 19f, 16.5f)
            curveTo(19.465f, 16.5f, 19.6975f, 16.5f, 19.8882f, 16.5511f)
            curveTo(20.4059f, 16.6898f, 20.8102f, 17.0941f, 20.9489f, 17.6118f)
            curveTo(21f, 17.8025f, 21f, 18.035f, 21f, 18.5f)
            curveTo(21f, 18.965f, 21f, 19.1975f, 20.9489f, 19.3882f)
            curveTo(20.8102f, 19.9059f, 20.4059f, 20.3102f, 19.8882f, 20.4489f)
            curveTo(19.6975f, 20.5f, 19.465f, 20.5f, 19f, 20.5f)
            horizontalLineTo(16f)
            curveTo(15.6265f, 20.5f, 15.4398f, 20.5f, 15.3219f, 20.4301f)
            curveTo(15.204f, 20.3603f, 15.0545f, 20.0872f, 14.7555f, 19.541f)
            curveTo(14.4159f, 18.9207f, 13.7571f, 18.5f, 13f, 18.5f)
            curveTo(12.2429f, 18.5f, 11.5841f, 18.9207f, 11.2445f, 19.541f)
            curveTo(10.9455f, 20.0872f, 10.796f, 20.3603f, 10.6781f, 20.4301f)
            curveTo(10.5602f, 20.5f, 10.3735f, 20.5f, 10f, 20.5f)
            horizontalLineTo(7f)
            curveTo(6.53501f, 20.5f, 6.30252f, 20.5f, 6.11177f, 20.4489f)
            curveTo(5.59413f, 20.3102f, 5.18981f, 19.9059f, 5.05111f, 19.3882f)
            curveTo(5f, 19.1975f, 5f, 18.965f, 5f, 18.5f)
            curveTo(5f, 18.035f, 5f, 17.8025f, 5.05111f, 17.6118f)
            curveTo(5.18981f, 17.0941f, 5.59413f, 16.6898f, 6.11177f, 16.5511f)
            curveTo(6.30252f, 16.5f, 6.53501f, 16.5f, 7f, 16.5f)
            curveTo(8.65685f, 16.5f, 10f, 15.1569f, 10f, 13.5f)
            verticalLineTo(11.5f)
        }
        }.build()

        return _anvil!!
    }

private var _anvil: ImageVector? = null
