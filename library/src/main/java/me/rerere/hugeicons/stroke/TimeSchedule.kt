package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TimeSchedule: ImageVector
    get() {
        if (_timeSchedule != null) {
            return _timeSchedule!!
        }
        _timeSchedule = ImageVector.Builder(
            name = "TimeSchedule",
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
        moveTo(12f, 8f)
        verticalLineTo(12f)
        lineTo(13.5f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5454f, 16.4534f)
        curveTo(21.1818f, 17.337f, 22f, 17.7789f, 22f, 18.5f)
        curveTo(22f, 19.2211f, 21.1818f, 19.663f, 19.5454f, 20.5466f)
        lineTo(18.4311f, 21.1484f)
        curveTo(17.1744f, 21.827f, 16.5461f, 22.1663f, 16.2439f, 21.9196f)
        curveTo(15.504f, 21.3154f, 16.6567f, 19.7561f, 16.9403f, 19.2037f)
        curveTo(17.2277f, 18.644f, 17.2225f, 18.3459f, 16.9403f, 17.7963f)
        curveTo(16.6567f, 17.2439f, 15.504f, 15.6846f, 16.2439f, 15.0804f)
        curveTo(16.5461f, 14.8337f, 17.1744f, 15.173f, 18.4311f, 15.8516f)
        lineTo(19.5454f, 16.4534f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.0261f, 21.948f)
        curveTo(12.6888f, 21.9824f, 12.3464f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 12.6849f, 21.9311f, 13.3538f, 21.8f, 14f)
        }
        }.build()

        return _timeSchedule!!
    }

private var _timeSchedule: ImageVector? = null
