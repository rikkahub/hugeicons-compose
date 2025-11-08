package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Berlin: ImageVector
    get() {
        if (_berlin != null) {
            return _berlin!!
        }
        _berlin = ImageVector.Builder(
            name = "Berlin",
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
        moveTo(2f, 5.3f)
        horizontalLineTo(9f)
        moveTo(15f, 5.3f)
        horizontalLineTo(22f)
        moveTo(22f, 9.7f)
        horizontalLineTo(16.4396f)
        curveTo(15.3109f, 9.7f, 14.7465f, 9.7f, 14.4465f, 9.29739f)
        curveTo(14.1464f, 8.89478f, 14.2571f, 8.28603f, 14.4784f, 7.06855f)
        lineTo(14.5216f, 6.83145f)
        curveTo(14.7429f, 5.61397f, 14.8536f, 5.00522f, 14.5535f, 4.60261f)
        curveTo(14.2535f, 4.2f, 13.6891f, 4.2f, 12.5604f, 4.2f)
        horizontalLineTo(11.4396f)
        curveTo(10.3109f, 4.2f, 9.74652f, 4.2f, 9.44646f, 4.60261f)
        curveTo(9.1464f, 5.00522f, 9.25709f, 5.61397f, 9.47845f, 6.83145f)
        lineTo(9.52155f, 7.06855f)
        curveTo(9.74291f, 8.28603f, 9.8536f, 8.89478f, 9.55354f, 9.29739f)
        curveTo(9.25348f, 9.7f, 8.68912f, 9.7f, 7.56039f, 9.7f)
        horizontalLineTo(2f)
        moveTo(13.5f, 4.2f)
        curveTo(13.5f, 3.65f, 13.7f, 2.44f, 14.5f, 2f)
        moveTo(10.5f, 4.2f)
        curveTo(10.5f, 3.65f, 10.3f, 2.44f, 9.5f, 2f)
        moveTo(3f, 5.3f)
        verticalLineTo(22f)
        moveTo(21f, 5.3f)
        verticalLineTo(22f)
        moveTo(18f, 9.7f)
        verticalLineTo(22f)
        moveTo(15f, 22f)
        verticalLineTo(9.7f)
        horizontalLineTo(9f)
        verticalLineTo(22f)
        moveTo(6f, 9.7f)
        verticalLineTo(22f)
        moveTo(2f, 22f)
        horizontalLineTo(22f)
        }
        }.build()

        return _berlin!!
    }

private var _berlin: ImageVector? = null
