package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GraduationScroll: ImageVector
    get() {
        if (_graduationScroll != null) {
            return _graduationScroll!!
        }
        _graduationScroll = ImageVector.Builder(
            name = "GraduationScroll",
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
        moveTo(21.1609f, 9.92846f)
        curveTo(22.1928f, 9.54155f, 22.2858f, 7.69292f, 21.3685f, 5.79943f)
        curveTo(20.4512f, 3.90594f, 18.8711f, 2.68462f, 17.8391f, 3.07154f)
        moveTo(21.1609f, 9.92846f)
        curveTo(20.1289f, 10.3154f, 18.5488f, 9.09406f, 17.6315f, 7.20057f)
        curveTo(16.7142f, 5.30708f, 16.8072f, 3.45845f, 17.8391f, 3.07154f)
        moveTo(21.1609f, 9.92846f)
        lineTo(6.16089f, 18.9285f)
        curveTo(5.12895f, 19.3154f, 3.54878f, 18.0941f, 2.6315f, 16.2006f)
        curveTo(1.71421f, 14.3071f, 1.80716f, 12.4584f, 2.83911f, 12.0715f)
        lineTo(17.8391f, 3.07154f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 13.6072f)
        curveTo(13.6383f, 13.0342f, 10.9233f, 10.9509f, 10.9574f, 7.20117f)
        moveTo(11.5f, 15.7012f)
        curveTo(10.3333f, 15.1444f, 7.9f, 13.0787f, 7.5f, 9.26966f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.43f, 14f)
        curveTo(16.0276f, 15.1302f, 16.639f, 18.1124f, 14.5498f, 21f)
        lineTo(13.5632f, 19.584f)
        lineTo(11f, 20.8103f)
        curveTo(11f, 20.8103f, 12.8249f, 18.8868f, 11.9528f, 16f)
        }
        }.build()

        return _graduationScroll!!
    }

private var _graduationScroll: ImageVector? = null
