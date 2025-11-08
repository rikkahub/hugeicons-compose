package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShareKnowledge: ImageVector
    get() {
        if (_shareKnowledge != null) {
            return _shareKnowledge!!
        }
        _shareKnowledge = ImageVector.Builder(
            name = "ShareKnowledge",
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
        moveTo(2f, 11f)
        curveTo(4.3317f, 8.55783f, 7.64323f, 8.44283f, 10f, 11f)
        moveTo(8.49509f, 4.5f)
        curveTo(8.49509f, 5.88071f, 7.37421f, 7f, 5.99153f, 7f)
        curveTo(4.60885f, 7f, 3.48797f, 5.88071f, 3.48797f, 4.5f)
        curveTo(3.48797f, 3.11929f, 4.60885f, 2f, 5.99153f, 2f)
        curveTo(7.37421f, 2f, 8.49509f, 3.11929f, 8.49509f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 22f)
        curveTo(16.3317f, 19.5578f, 19.6432f, 19.4428f, 22f, 22f)
        moveTo(20.4951f, 15.5f)
        curveTo(20.4951f, 16.8807f, 19.3742f, 18f, 17.9915f, 18f)
        curveTo(16.6089f, 18f, 15.488f, 16.8807f, 15.488f, 15.5f)
        curveTo(15.488f, 14.1193f, 16.6089f, 13f, 17.9915f, 13f)
        curveTo(19.3742f, 13f, 20.4951f, 14.1193f, 20.4951f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 14f)
        curveTo(3f, 17.87f, 6.13f, 21f, 10f, 21f)
        lineTo(9f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 3f)
        horizontalLineTo(21f)
        moveTo(15f, 6f)
        horizontalLineTo(21f)
        moveTo(15f, 9f)
        horizontalLineTo(18.5f)
        }
        }.build()

        return _shareKnowledge!!
    }

private var _shareKnowledge: ImageVector? = null
