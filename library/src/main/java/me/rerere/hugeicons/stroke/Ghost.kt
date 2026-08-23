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

val HugeIcons.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = ImageVector.Builder(
            name = "Ghost",
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
            moveTo(12f, 2.5f)
            curveTo(8.13924f, 2.5f, 5.00948f, 5.61997f, 5.00948f, 9.46865f)
            verticalLineTo(11.7676f)
            curveTo(5.00948f, 14.1753f, 4.37917f, 16.5414f, 3.18085f, 18.6319f)
            curveTo(2.532f, 19.7638f, 3.74988f, 21.0472f, 4.91961f, 20.4642f)
            lineTo(5.84783f, 20.0015f)
            curveTo(6.52687f, 19.6631f, 7.35027f, 19.8348f, 7.83629f, 20.4162f)
            lineTo(8.25508f, 20.9172f)
            curveTo(8.90472f, 21.6943f, 10.1021f, 21.6943f, 10.7517f, 20.9172f)
            curveTo(11.0765f, 20.5286f, 11.5383f, 20.3343f, 12f, 20.3343f)
            curveTo(12.4617f, 20.3343f, 12.9235f, 20.5286f, 13.2483f, 20.9172f)
            curveTo(13.8979f, 21.6943f, 15.0953f, 21.6943f, 15.7449f, 20.9172f)
            lineTo(16.1637f, 20.4162f)
            curveTo(16.6497f, 19.8348f, 17.4731f, 19.6631f, 18.1522f, 20.0015f)
            lineTo(19.0804f, 20.4642f)
            curveTo(20.2501f, 21.0472f, 21.468f, 19.7638f, 20.8192f, 18.6319f)
            curveTo(19.6208f, 16.5414f, 18.9905f, 14.1753f, 18.9905f, 11.7676f)
            verticalLineTo(9.46865f)
            curveTo(18.9905f, 5.61997f, 15.8608f, 2.5f, 12f, 2.5f)
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
            moveTo(15f, 10.125f)
            verticalLineTo(10.25f)
            moveTo(15.25f, 10.25f)
            curveTo(15.25f, 10.3881f, 15.1381f, 10.5f, 15f, 10.5f)
            curveTo(14.8619f, 10.5f, 14.75f, 10.3881f, 14.75f, 10.25f)
            curveTo(14.75f, 10.1119f, 14.8619f, 10f, 15f, 10f)
            curveTo(15.1381f, 10f, 15.25f, 10.1119f, 15.25f, 10.25f)
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
            moveTo(9f, 10.125f)
            verticalLineTo(10.25f)
            moveTo(9.25f, 10.25f)
            curveTo(9.25f, 10.3881f, 9.13807f, 10.5f, 9f, 10.5f)
            curveTo(8.86193f, 10.5f, 8.75f, 10.3881f, 8.75f, 10.25f)
            curveTo(8.75f, 10.1119f, 8.86193f, 10f, 9f, 10f)
            curveTo(9.13807f, 10f, 9.25f, 10.1119f, 9.25f, 10.25f)
            close()
        }
        }.build()

        return _ghost!!
    }

private var _ghost: ImageVector? = null
