package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LeavingGeoFence: ImageVector
    get() {
        if (_leavingGeoFence != null) {
            return _leavingGeoFence!!
        }
        _leavingGeoFence = ImageVector.Builder(
            name = "LeavingGeoFence",
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
        moveTo(12f, 17f)
        lineTo(12f, 3f)
        moveTo(12f, 3f)
        curveTo(11.6272f, 3f, 11.3272f, 3.34263f, 10.7272f, 4.02777f)
        lineTo(9f, 6.00006f)
        moveTo(12f, 3f)
        curveTo(12.3728f, 3f, 12.6728f, 3.34263f, 13.2728f, 4.02777f)
        lineTo(15f, 6.00006f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 15f)
        curveTo(3.7492f, 15.6327f, 3f, 16.4385f, 3f, 17.3158f)
        curveTo(3f, 19.3505f, 7.02944f, 21f, 12f, 21f)
        curveTo(16.9706f, 21f, 21f, 19.3505f, 21f, 17.3158f)
        curveTo(21f, 16.4385f, 20.2508f, 15.6327f, 19f, 15f)
        }
        }.build()

        return _leavingGeoFence!!
    }

private var _leavingGeoFence: ImageVector? = null
