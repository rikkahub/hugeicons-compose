package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Swarm: ImageVector
    get() {
        if (_swarm != null) {
            return _swarm!!
        }
        _swarm = ImageVector.Builder(
            name = "Swarm",
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
        moveTo(17f, 5.16667f)
        curveTo(17f, 6.54738f, 15f, 8f, 15f, 8f)
        curveTo(15f, 8f, 13f, 6.54738f, 13f, 5.16667f)
        curveTo(13f, 3.78595f, 13.8954f, 3f, 15f, 3f)
        curveTo(16.1046f, 3f, 17f, 3.78595f, 17f, 5.16667f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.19619f, 6.2113f)
        curveTo(8.38286f, 6.85752f, 10f, 10.3713f, 10f, 10.3713f)
        curveTo(10f, 10.3713f, 7.01604f, 12.5253f, 4.82937f, 11.8791f)
        curveTo(2.6427f, 11.2328f, 1.70394f, 9.59622f, 2.08138f, 8.03111f)
        curveTo(2.45882f, 6.466f, 4.00952f, 5.56508f, 6.19619f, 6.2113f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.15f, 20.0801f)
        curveTo(14.4577f, 22.1966f, 8f, 19.9982f, 8f, 19.9982f)
        curveTo(8f, 19.9982f, 9.31133f, 13.3462f, 13.0036f, 11.2297f)
        curveTo(16.6958f, 9.11311f, 19.9496f, 9.88953f, 21.3708f, 12.3335f)
        curveTo(22.7919f, 14.7775f, 21.8422f, 17.9635f, 18.15f, 20.0801f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 10.5f)
        curveTo(16f, 13.5398f, 17.5963f, 16.3439f, 20f, 18.0664f)
        moveTo(11f, 13.0581f)
        curveTo(11.183f, 15.8919f, 13.7098f, 18.888f, 16f, 20.5f)
        }
        }.build()

        return _swarm!!
    }

private var _swarm: ImageVector? = null
