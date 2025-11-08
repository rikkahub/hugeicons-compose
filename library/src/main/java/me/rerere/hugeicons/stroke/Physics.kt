package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Physics: ImageVector
    get() {
        if (_physics != null) {
            return _physics!!
        }
        _physics = ImageVector.Builder(
            name = "Physics",
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
        moveTo(12f, 5.79314f)
        curveTo(13.1131f, 6.59894f, 14.2449f, 7.56172f, 15.3416f, 8.65837f)
        curveTo(16.4383f, 9.75506f, 17.4011f, 10.8869f, 18.2069f, 12.0001f)
        moveTo(12f, 5.79314f)
        curveTo(10.8869f, 6.59894f, 9.75509f, 7.56172f, 8.65843f, 8.65838f)
        curveTo(7.56175f, 9.75507f, 6.59895f, 10.8869f, 5.79314f, 12.0001f)
        moveTo(12f, 5.79314f)
        curveTo(15.5699f, 3.20879f, 18.9472f, 2.23908f, 20.3541f, 3.64594f)
        curveTo(21.7609f, 5.05281f, 20.7912f, 8.43014f, 18.2069f, 12.0001f)
        moveTo(18.2069f, 12.0001f)
        curveTo(20.7912f, 15.5699f, 21.7608f, 18.9472f, 20.354f, 20.3541f)
        curveTo(19.3109f, 21.3971f, 17.1848f, 21.1338f, 14.7f, 19.8747f)
        moveTo(18.2069f, 12.0001f)
        curveTo(17.4011f, 13.1132f, 16.4383f, 14.245f, 15.3417f, 15.3416f)
        curveTo(14.245f, 16.4383f, 13.1131f, 17.4011f, 12f, 18.2069f)
        moveTo(12f, 18.2069f)
        curveTo(10.8869f, 17.4011f, 9.75503f, 16.4383f, 8.65834f, 15.3416f)
        curveTo(7.5617f, 14.245f, 6.59893f, 13.1132f, 5.79314f, 12.0001f)
        moveTo(12f, 18.2069f)
        curveTo(8.43014f, 20.7912f, 5.05287f, 21.7609f, 3.64602f, 20.3541f)
        curveTo(2.23917f, 18.9472f, 3.20885f, 15.5699f, 5.79314f, 12.0001f)
        moveTo(5.79314f, 12.0001f)
        curveTo(3.20878f, 8.43014f, 2.23907f, 5.0528f, 3.64593f, 3.64593f)
        curveTo(4.689f, 2.60286f, 6.81521f, 2.86619f, 9.3f, 4.12538f)
        }
        }.build()

        return _physics!!
    }

private var _physics: ImageVector? = null
