package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CallMissed02: ImageVector
    get() {
        if (_callMissed02 != null) {
            return _callMissed02!!
        }
        _callMissed02 = ImageVector.Builder(
            name = "CallMissed02",
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
        moveTo(17.0539f, 14.0292f)
        verticalLineTo(16.7928f)
        curveTo(17.0539f, 17.3565f, 17.4143f, 17.8705f, 17.9747f, 18.1385f)
        curveTo(18.413f, 18.3481f, 18.9322f, 18.6067f, 19.3546f, 18.847f)
        curveTo(19.7452f, 19.0692f, 20.293f, 19.0557f, 20.6214f, 18.765f)
        lineTo(21.5133f, 17.9757f)
        curveTo(22.17f, 17.3945f, 22.1749f, 16.4442f, 21.4501f, 15.9302f)
        curveTo(15.9402f, 12.0233f, 8.05983f, 12.0233f, 2.54993f, 15.9302f)
        curveTo(1.82509f, 16.4442f, 1.82997f, 17.3945f, 2.48673f, 17.9757f)
        lineTo(3.3786f, 18.765f)
        curveTo(3.70697f, 19.0557f, 4.24369f, 19.0574f, 4.62554f, 18.8235f)
        curveTo(5.0468f, 18.5655f, 5.53006f, 18.3258f, 5.94613f, 18.1356f)
        curveTo(6.54384f, 17.8623f, 6.94607f, 17.3266f, 6.94607f, 16.7312f)
        verticalLineTo(14.0292f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.2368f, 9f)
        curveTo(7.14942f, 7.99573f, 6.74189f, 5.76249f, 7.25219f, 5.25219f)
        curveTo(7.76249f, 4.74189f, 9.99573f, 5.14942f, 11f, 5.2368f)
        moveTo(7.5f, 5.5f)
        lineTo(11.1464f, 9.14645f)
        curveTo(11.3728f, 9.37282f, 11.6799f, 9.5f, 12f, 9.5f)
        curveTo(12.3201f, 9.5f, 12.6272f, 9.37282f, 12.8536f, 9.14645f)
        lineTo(17f, 5f)
        }
        }.build()

        return _callMissed02!!
    }

private var _callMissed02: ImageVector? = null
