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

val HugeIcons.Authorized: ImageVector
    get() {
        if (_authorized != null) {
            return _authorized!!
        }
        _authorized = ImageVector.Builder(
            name = "Authorized",
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
            moveTo(2f, 17f)
            curveTo(2f, 19.2091f, 3.79086f, 21f, 6f, 21f)
            curveTo(7.48057f, 21f, 8.77325f, 20.1956f, 9.46487f, 19f)
            horizontalLineTo(13.3739f)
            curveTo(13.6095f, 19f, 13.7273f, 19f, 13.84f, 19.0265f)
            curveTo(13.8812f, 19.0361f, 13.9217f, 19.0484f, 13.9613f, 19.0632f)
            curveTo(14.0698f, 19.1037f, 14.1678f, 19.169f, 14.3638f, 19.2997f)
            lineTo(14.4045f, 19.3268f)
            curveTo(14.8093f, 19.5967f, 15.0118f, 19.7317f, 15.2332f, 19.7646f)
            curveTo(15.3491f, 19.7819f, 15.4671f, 19.7786f, 15.5819f, 19.7549f)
            curveTo(15.8012f, 19.7098f, 15.9958f, 19.5638f, 16.3851f, 19.2719f)
            lineTo(16.4867f, 19.1956f)
            curveTo(16.7997f, 18.9609f, 16.9562f, 18.8435f, 17.1261f, 18.7924f)
            curveTo(17.314f, 18.7359f, 17.5144f, 18.7359f, 17.7024f, 18.7924f)
            curveTo(17.8723f, 18.8435f, 18.0287f, 18.9609f, 18.3417f, 19.1956f)
            curveTo(18.6995f, 19.4639f, 18.8784f, 19.5981f, 19.0695f, 19.6476f)
            curveTo(19.2808f, 19.7024f, 19.5042f, 19.6865f, 19.7056f, 19.6024f)
            curveTo(19.8878f, 19.5264f, 20.046f, 19.3682f, 20.3622f, 19.052f)
            lineTo(21f, 18.4142f)
            curveTo(21.6667f, 17.7475f, 22f, 17.4142f, 22f, 17f)
            curveTo(22f, 16.5858f, 21.6667f, 16.2525f, 21f, 15.5858f)
            curveTo(20.711f, 15.2968f, 20.5665f, 15.1522f, 20.3827f, 15.0761f)
            curveTo(20.1989f, 15f, 19.9945f, 15f, 19.5858f, 15f)
            horizontalLineTo(9.46487f)
            curveTo(8.77325f, 13.8044f, 7.48057f, 13f, 6f, 13f)
            curveTo(3.79086f, 13f, 2f, 14.7909f, 2f, 17f)
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
            moveTo(20f, 11f)
            verticalLineTo(9f)
            curveTo(20f, 6.17157f, 20f, 4.75736f, 19.1213f, 3.87868f)
            curveTo(18.2426f, 3f, 16.8284f, 3f, 14f, 3f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 3f, 3.75736f, 3f, 2.87868f, 3.87868f)
            curveTo(2f, 4.75736f, 2f, 6.17157f, 2f, 9f)
            verticalLineTo(11f)
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
            moveTo(6.125f, 17f)
            horizontalLineTo(6f)
            moveTo(6.25f, 17f)
            curveTo(6.25f, 17.1381f, 6.13807f, 17.25f, 6f, 17.25f)
            curveTo(5.86193f, 17.25f, 5.75f, 17.1381f, 5.75f, 17f)
            curveTo(5.75f, 16.8619f, 5.86193f, 16.75f, 6f, 16.75f)
            curveTo(6.13807f, 16.75f, 6.25f, 16.8619f, 6.25f, 17f)
            close()
        }
        }.build()

        return _authorized!!
    }

private var _authorized: ImageVector? = null
