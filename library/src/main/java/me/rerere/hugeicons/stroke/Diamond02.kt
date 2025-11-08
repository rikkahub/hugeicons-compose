package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Diamond02: ImageVector
    get() {
        if (_diamond02 != null) {
            return _diamond02!!
        }
        _diamond02 = ImageVector.Builder(
            name = "Diamond02",
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
        moveTo(5.78223f, 4.18192f)
        curveTo(6.43007f, 3.68319f, 6.754f, 3.43383f, 7.12788f, 3.27323f)
        curveTo(7.29741f, 3.20041f, 7.47367f, 3.14158f, 7.65459f, 3.09741f)
        curveTo(8.0536f, 3f, 8.4767f, 3f, 9.32289f, 3f)
        horizontalLineTo(14.6771f)
        curveTo(15.5233f, 3f, 15.9464f, 3f, 16.3454f, 3.09741f)
        curveTo(16.5263f, 3.14158f, 16.7026f, 3.20041f, 16.8721f, 3.27323f)
        curveTo(17.246f, 3.43383f, 17.5699f, 3.68319f, 18.2178f, 4.18192f)
        curveTo(20.3644f, 5.83448f, 21.4378f, 6.66077f, 21.8057f, 7.73078f)
        curveTo(21.9694f, 8.20673f, 22.0305f, 8.70728f, 21.9858f, 9.20461f)
        curveTo(21.8852f, 10.3227f, 21.0379f, 11.346f, 19.3433f, 13.3925f)
        lineTo(15.3498f, 18.2153f)
        curveTo(13.8126f, 20.0718f, 13.044f, 21f, 12f, 21f)
        curveTo(10.956f, 21f, 10.1874f, 20.0718f, 8.65018f, 18.2153f)
        lineTo(4.65671f, 13.3925f)
        curveTo(2.96208f, 11.346f, 2.11476f, 10.3227f, 2.0142f, 9.20461f)
        curveTo(1.96947f, 8.70728f, 2.03064f, 8.20673f, 2.1943f, 7.73078f)
        curveTo(2.56224f, 6.66077f, 3.63557f, 5.83448f, 5.78223f, 4.18192f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 8.5f)
        horizontalLineTo(14f)
        }
        }.build()

        return _diamond02!!
    }

private var _diamond02: ImageVector? = null
