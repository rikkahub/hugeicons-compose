package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Envato: ImageVector
    get() {
        if (_envato != null) {
            return _envato!!
        }
        _envato = ImageVector.Builder(
            name = "Envato",
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
        moveTo(5.6208f, 9.71868f)
        curveTo(5.57738f, 11.0491f, 5.74133f, 12.522f, 6.29962f, 13.7648f)
        curveTo(6.58057f, 14.3902f, 6.72104f, 14.7029f, 6.97131f, 14.6597f)
        curveTo(7.22157f, 14.6165f, 7.24731f, 14.225f, 7.2988f, 13.4418f)
        curveTo(7.63656f, 8.30431f, 12.0617f, 2.82088f, 17.2345f, 2.06656f)
        curveTo(17.7565f, 1.99044f, 18.0175f, 1.95237f, 18.3247f, 2.10501f)
        curveTo(18.6318f, 2.25765f, 18.7647f, 2.50609f, 19.0305f, 3.00296f)
        curveTo(23.4777f, 11.3161f, 20.1384f, 22f, 11.581f, 22f)
        curveTo(4.84807f, 22f, 0.829706f, 14.1923f, 4.23649f, 9.08353f)
        curveTo(4.77945f, 8.26932f, 5.05093f, 7.86222f, 5.36303f, 7.95815f)
        curveTo(5.67513f, 8.05409f, 5.65702f, 8.60895f, 5.6208f, 9.71868f)
        }
        }.build()

        return _envato!!
    }

private var _envato: ImageVector? = null
