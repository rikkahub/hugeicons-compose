package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Github01: ImageVector
    get() {
        if (_github01 != null) {
            return _github01!!
        }
        _github01 = ImageVector.Builder(
            name = "Github01",
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
        moveTo(6.51734f, 17.1132f)
        curveTo(6.91177f, 17.6905f, 8.10883f, 18.9228f, 9.74168f, 19.2333f)
        moveTo(9.86428f, 22f)
        curveTo(8.83582f, 21.8306f, 2f, 19.6057f, 2f, 12.0926f)
        curveTo(2f, 5.06329f, 8.0019f, 2f, 12.0008f, 2f)
        curveTo(15.9996f, 2f, 22f, 5.06329f, 22f, 12.0926f)
        curveTo(22f, 19.6057f, 15.1642f, 21.8306f, 14.1357f, 22f)
        curveTo(14.1357f, 22f, 13.9267f, 18.5826f, 14.0487f, 17.9969f)
        curveTo(14.1706f, 17.4113f, 13.7552f, 16.4688f, 13.7552f, 16.4688f)
        curveTo(14.7262f, 16.1055f, 16.2043f, 15.5847f, 16.7001f, 14.1874f)
        curveTo(17.0848f, 13.1032f, 17.3268f, 11.5288f, 16.2508f, 10.0489f)
        curveTo(16.2508f, 10.0489f, 16.5318f, 7.65809f, 15.9996f, 7.56548f)
        curveTo(15.4675f, 7.47287f, 13.8998f, 8.51192f, 13.8998f, 8.51192f)
        curveTo(13.4432f, 8.38248f, 12.4243f, 8.13476f, 12.0018f, 8.17939f)
        curveTo(11.5792f, 8.13476f, 10.5568f, 8.38248f, 10.1002f, 8.51192f)
        curveTo(10.1002f, 8.51192f, 8.53249f, 7.47287f, 8.00036f, 7.56548f)
        curveTo(7.46823f, 7.65809f, 7.74917f, 10.0489f, 7.74917f, 10.0489f)
        curveTo(6.67316f, 11.5288f, 6.91516f, 13.1032f, 7.2999f, 14.1874f)
        curveTo(7.79575f, 15.5847f, 9.27384f, 16.1055f, 10.2448f, 16.4688f)
        curveTo(10.2448f, 16.4688f, 9.82944f, 17.4113f, 9.95135f, 17.9969f)
        curveTo(10.0733f, 18.5826f, 9.86428f, 22f, 9.86428f, 22f)
        }
        }.build()

        return _github01!!
    }

private var _github01: ImageVector? = null
