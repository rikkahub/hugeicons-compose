package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InspectCode: ImageVector
    get() {
        if (_inspectCode != null) {
            return _inspectCode!!
        }
        _inspectCode = ImageVector.Builder(
            name = "InspectCode",
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
        moveTo(17.5f, 17.5f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 11f)
        curveTo(20f, 6.02944f, 15.9706f, 2f, 11f, 2f)
        curveTo(6.02944f, 2f, 2f, 6.02944f, 2f, 11f)
        curveTo(2f, 15.9706f, 6.02944f, 20f, 11f, 20f)
        curveTo(15.9706f, 20f, 20f, 15.9706f, 20f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 9.5f)
        lineTo(15.4199f, 10.2929f)
        curveTo(15.8066f, 10.6262f, 16f, 10.7929f, 16f, 11f)
        curveTo(16f, 11.2071f, 15.8066f, 11.3738f, 15.4199f, 11.7071f)
        lineTo(14.5f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 9.5f)
        lineTo(6.58009f, 10.2929f)
        curveTo(6.19337f, 10.6262f, 6f, 10.7929f, 6f, 11f)
        curveTo(6f, 11.2071f, 6.19336f, 11.3738f, 6.58009f, 11.7071f)
        lineTo(7.5f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8.5f)
        lineTo(10f, 13.5f)
        }
        }.build()

        return _inspectCode!!
    }

private var _inspectCode: ImageVector? = null
