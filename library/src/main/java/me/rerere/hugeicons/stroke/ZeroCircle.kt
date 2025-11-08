package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ZeroCircle: ImageVector
    get() {
        if (_zeroCircle != null) {
            return _zeroCircle!!
        }
        _zeroCircle = ImageVector.Builder(
            name = "ZeroCircle",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 14f)
        verticalLineTo(10f)
        curveTo(15f, 8.34315f, 13.6569f, 7f, 12f, 7f)
        curveTo(10.3431f, 7f, 9f, 8.34315f, 9f, 10f)
        verticalLineTo(14f)
        curveTo(9f, 15.6569f, 10.3431f, 17f, 12f, 17f)
        curveTo(13.6569f, 17f, 15f, 15.6569f, 15f, 14f)
        }
        }.build()

        return _zeroCircle!!
    }

private var _zeroCircle: ImageVector? = null
