package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StopCircle: ImageVector
    get() {
        if (_stopCircle != null) {
            return _stopCircle!!
        }
        _stopCircle = ImageVector.Builder(
            name = "StopCircle",
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
        moveTo(9.38886f, 15.1629f)
        curveTo(9.89331f, 15.5f, 10.5955f, 15.5f, 12f, 15.5f)
        curveTo(13.4045f, 15.5f, 14.1067f, 15.5f, 14.6111f, 15.1629f)
        curveTo(14.8295f, 15.017f, 15.017f, 14.8295f, 15.1629f, 14.6111f)
        curveTo(15.5f, 14.1067f, 15.5f, 13.4045f, 15.5f, 12f)
        curveTo(15.5f, 10.5955f, 15.5f, 9.89331f, 15.1629f, 9.38886f)
        curveTo(15.017f, 9.17048f, 14.8295f, 8.98298f, 14.6111f, 8.83706f)
        curveTo(14.1067f, 8.5f, 13.4045f, 8.5f, 12f, 8.5f)
        curveTo(10.5955f, 8.5f, 9.89331f, 8.5f, 9.38886f, 8.83706f)
        curveTo(9.17048f, 8.98298f, 8.98298f, 9.17048f, 8.83706f, 9.38886f)
        curveTo(8.5f, 9.89331f, 8.5f, 10.5955f, 8.5f, 12f)
        curveTo(8.5f, 13.4045f, 8.5f, 14.1067f, 8.83706f, 14.6111f)
        curveTo(8.98298f, 14.8295f, 9.17048f, 15.017f, 9.38886f, 15.1629f)
        }
        }.build()

        return _stopCircle!!
    }

private var _stopCircle: ImageVector? = null
