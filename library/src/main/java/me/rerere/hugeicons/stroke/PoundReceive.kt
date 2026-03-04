package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PoundReceive: ImageVector
    get() {
        if (_poundReceive != null) {
            return _poundReceive!!
        }
        _poundReceive = ImageVector.Builder(
            name = "PoundReceive",
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
        moveTo(14.25f, 13.025f)
        horizontalLineTo(21.75f)
        moveTo(14.25f, 13.025f)
        curveTo(14.25f, 13.7252f, 16.25f, 15.025f, 17.25f, 15.525f)
        moveTo(14.25f, 13.025f)
        curveTo(14.25f, 12.3248f, 16.4167f, 11.025f, 17.25f, 10.525f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.662f, 8.52502f)
        curveTo(12.662f, 6.40438f, 10.9917f, 3.91085f, 8.25f, 4.00232f)
        curveTo(7.52476f, 4.02652f, 6.72455f, 4.25845f, 5.86047f, 4.76706f)
        curveTo(4.4716f, 5.68479f, 2.67966f, 8.7359f, 4.84287f, 11.9369f)
        curveTo(5.89496f, 13.4937f, 6.86653f, 13.525f, 9.75f, 13.525f)
        horizontalLineTo(2.25f)
        moveTo(6.703f, 14.0073f)
        curveTo(6.16468f, 15.5015f, 4.53524f, 18.8988f, 2.32404f, 19.987f)
        horizontalLineTo(11.2098f)
        curveTo(11.6185f, 19.987f, 12.8337f, 20.1991f, 14.229f, 18.9241f)
        }
        }.build()

        return _poundReceive!!
    }

private var _poundReceive: ImageVector? = null
