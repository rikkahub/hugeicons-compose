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
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.1475f, 5.43668f)
        lineTo(19.4895f, 4.39419f)
        curveTo(19.1252f, 3.81704f, 18.943f, 3.52846f, 18.7044f, 3.50178f)
        curveTo(18.4657f, 3.4751f, 18.1993f, 3.74896f, 17.6664f, 4.29667f)
        curveTo(15.9443f, 6.06689f, 14.2221f, 5.80537f, 12.5f, 8.98839f)
        curveTo(10.7779f, 5.80537f, 9.05571f, 6.06689f, 7.33356f, 4.29667f)
        curveTo(6.80071f, 3.74896f, 6.53429f, 3.4751f, 6.29565f, 3.50178f)
        curveTo(6.057f, 3.52846f, 5.87485f, 3.81704f, 5.51054f, 4.39419f)
        lineTo(4.85251f, 5.43668f)
        curveTo(4.59827f, 5.83945f, 4.47115f, 6.04084f, 4.50553f, 6.2528f)
        curveTo(4.53991f, 6.46476f, 4.72324f, 6.60998f, 5.08991f, 6.90042f)
        lineTo(11.2724f, 11.7977f)
        curveTo(11.8634f, 12.2659f, 12.159f, 12.5f, 12.5f, 12.5f)
        curveTo(12.841f, 12.5f, 13.1366f, 12.2659f, 13.7276f, 11.7977f)
        lineTo(19.9101f, 6.90042f)
        curveTo(20.2768f, 6.60998f, 20.4601f, 6.46476f, 20.4945f, 6.2528f)
        curveTo(20.5288f, 6.04084f, 20.4017f, 5.83945f, 20.1475f, 5.43668f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22.5f, 8.5f)
        lineTo(6.5f, 20.5f)
        verticalLineTo(15.8043f)
        moveTo(2.5f, 8.5f)
        lineTo(18.5f, 20.5f)
        verticalLineTo(15.8043f)
        }
        }.build()

        return _quran01!!
    }

private var _quran01: ImageVector? = null
