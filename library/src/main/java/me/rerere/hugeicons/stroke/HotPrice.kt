package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HotPrice: ImageVector
    get() {
        if (_hotPrice != null) {
            return _hotPrice!!
        }
        _hotPrice = ImageVector.Builder(
            name = "HotPrice",
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
        moveTo(12f, 22f)
        curveTo(16.4183f, 22f, 20f, 18.4183f, 20f, 14f)
        curveTo(20f, 8f, 12f, 2f, 12f, 2f)
        curveTo(11.6117f, 4.48692f, 11.2315f, 5.82158f, 10f, 8f)
        curveTo(8.79908f, 7.4449f, 8.5f, 7f, 8f, 5.75f)
        curveTo(6f, 8f, 4f, 11f, 4f, 14f)
        curveTo(4f, 18.4183f, 7.58172f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 17f)
        lineTo(14f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 13f)
        horizontalLineTo(10.009f)
        moveTo(13.991f, 17f)
        horizontalLineTo(14f)
        }
        }.build()

        return _hotPrice!!
    }

private var _hotPrice: ImageVector? = null
