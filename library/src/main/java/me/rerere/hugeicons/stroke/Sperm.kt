package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sperm: ImageVector
    get() {
        if (_sperm != null) {
            return _sperm!!
        }
        _sperm = ImageVector.Builder(
            name = "Sperm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.89092f, 14.1091f)
        curveTo(12.1252f, 16.3433f, 15.189f, 16.9019f, 17.9818f, 14.1091f)
        curveTo(20.7746f, 11.3163f, 22.0272f, 6.0182f, 20.0045f, 3.99548f)
        curveTo(17.9818f, 1.97276f, 12.6837f, 3.22541f, 9.89092f, 6.0182f)
        curveTo(7.09812f, 8.811f, 7.65668f, 11.8748f, 9.89092f, 14.1091f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 21f)
        curveTo(3.41339f, 20.4523f, 4.05487f, 19.8823f, 5.17764f, 19.6079f)
        curveTo(6.07232f, 19.3892f, 6.51967f, 19.2799f, 6.68616f, 19.1665f)
        curveTo(7.02076f, 18.9388f, 7.12514f, 18.7561f, 7.14451f, 18.3644f)
        curveTo(7.15414f, 18.1695f, 7.04904f, 17.8687f, 6.83883f, 17.267f)
        curveTo(6.62862f, 16.6654f, 6.52352f, 16.3646f, 6.53315f, 16.1697f)
        curveTo(6.55252f, 15.778f, 6.6569f, 15.5953f, 6.9915f, 15.3675f)
        curveTo(7.15799f, 15.2542f, 7.60534f, 15.1449f, 8.50002f, 14.9262f)
        curveTo(9.29868f, 14.731f, 9.7855f, 14.3789f, 10f, 14f)
        }
        }.build()

        return _sperm!!
    }

private var _sperm: ImageVector? = null
