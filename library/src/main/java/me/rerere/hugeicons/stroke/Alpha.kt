package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Alpha: ImageVector
    get() {
        if (_alpha != null) {
            return _alpha!!
        }
        _alpha = ImageVector.Builder(
            name = "Alpha",
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
        moveTo(17.3943f, 4f)
        curveTo(17.5941f, 5.85f, 17.3444f, 10f, 16.1706f, 13.275f)
        curveTo(14.7721f, 17.5f, 12.6743f, 19.35f, 11.0011f, 19.8f)
        curveTo(7.75452f, 20.6731f, 5.03241f, 18.45f, 3.88362f, 15.975f)
        curveTo(2.40994f, 12.8f, 2.80975f, 9.125f, 4.8576f, 6.475f)
        curveTo(6.90545f, 3.825f, 10.7763f, 2.675f, 13.6483f, 6.25f)
        curveTo(14.7471f, 7.925f, 15.2216f, 9.725f, 15.4464f, 11.175f)
        curveTo(15.8959f, 12.775f, 16.1206f, 16.775f, 17.2944f, 18.725f)
        curveTo(18.2184f, 20.175f, 19.6419f, 20.1f, 20.1664f, 19.875f)
        curveTo(20.516f, 19.7f, 21f, 19.32f, 21f, 18.22f)
        }
        }.build()

        return _alpha!!
    }

private var _alpha: ImageVector? = null
