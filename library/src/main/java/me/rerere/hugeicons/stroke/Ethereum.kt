package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ethereum: ImageVector
    get() {
        if (_ethereum != null) {
            return _ethereum!!
        }
        _ethereum = ImageVector.Builder(
            name = "Ethereum",
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
        moveTo(18.9999f, 11.9999f)
        lineTo(13.2403f, 14.5784f)
        curveTo(12.6288f, 14.8594f, 12.3231f, 14.9999f, 11.9999f, 14.9999f)
        curveTo(11.6768f, 14.9999f, 11.371f, 14.8594f, 10.7595f, 14.5784f)
        lineTo(4.99993f, 11.9999f)
        moveTo(18.9999f, 11.9999f)
        curveTo(18.9999f, 11.4677f, 18.6944f, 10.9997f, 18.0833f, 10.0635f)
        lineTo(14.5796f, 4.69604f)
        curveTo(13.4063f, 2.89864f, 12.8197f, 1.99994f, 11.9999f, 1.99994f)
        curveTo(11.1802f, 1.99994f, 10.5935f, 2.89864f, 9.42025f, 4.69605f)
        lineTo(5.91656f, 10.0635f)
        curveTo(5.30547f, 10.9997f, 4.99993f, 11.4677f, 4.99993f, 11.9999f)
        moveTo(18.9999f, 11.9999f)
        curveTo(18.9999f, 12.5322f, 18.6944f, 13.0002f, 18.0833f, 13.9364f)
        lineTo(14.5796f, 19.3038f)
        curveTo(13.4063f, 21.1012f, 12.8197f, 21.9999f, 11.9999f, 21.9999f)
        curveTo(11.1802f, 21.9999f, 10.5935f, 21.1012f, 9.42026f, 19.3038f)
        lineTo(5.91656f, 13.9364f)
        curveTo(5.30547f, 13.0002f, 4.99993f, 12.5322f, 4.99993f, 11.9999f)
        }
        }.build()

        return _ethereum!!
    }

private var _ethereum: ImageVector? = null
