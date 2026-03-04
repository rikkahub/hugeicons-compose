package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Quran01: ImageVector
    get() {
        if (_quran01 != null) {
            return _quran01!!
        }
        _quran01 = ImageVector.Builder(
            name = "Quran01",
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
        moveTo(19.6475f, 5.43668f)
        lineTo(18.9895f, 4.39419f)
        curveTo(18.6252f, 3.81704f, 18.443f, 3.52846f, 18.2044f, 3.50178f)
        curveTo(17.9657f, 3.4751f, 17.6993f, 3.74896f, 17.1664f, 4.29667f)
        curveTo(15.4443f, 6.06689f, 13.7221f, 5.80537f, 12f, 8.98839f)
        curveTo(10.2779f, 5.80537f, 8.55571f, 6.06689f, 6.83356f, 4.29667f)
        curveTo(6.30071f, 3.74896f, 6.03429f, 3.4751f, 5.79565f, 3.50178f)
        curveTo(5.557f, 3.52846f, 5.37485f, 3.81704f, 5.01054f, 4.39419f)
        lineTo(4.35251f, 5.43668f)
        curveTo(4.09827f, 5.83945f, 3.97115f, 6.04084f, 4.00553f, 6.2528f)
        curveTo(4.03991f, 6.46476f, 4.22324f, 6.60998f, 4.58991f, 6.90042f)
        lineTo(10.7724f, 11.7977f)
        curveTo(11.3634f, 12.2659f, 11.659f, 12.5f, 12f, 12.5f)
        curveTo(12.341f, 12.5f, 12.6366f, 12.2659f, 13.2276f, 11.7977f)
        lineTo(19.4101f, 6.90042f)
        curveTo(19.7768f, 6.60998f, 19.9601f, 6.46476f, 19.9945f, 6.2528f)
        curveTo(20.0288f, 6.04084f, 19.9017f, 5.83945f, 19.6475f, 5.43668f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 8.5f)
        lineTo(6f, 20.5f)
        verticalLineTo(15.8043f)
        moveTo(2f, 8.5f)
        lineTo(18f, 20.5f)
        verticalLineTo(15.8043f)
        }
        }.build()

        return _quran01!!
    }

private var _quran01: ImageVector? = null
