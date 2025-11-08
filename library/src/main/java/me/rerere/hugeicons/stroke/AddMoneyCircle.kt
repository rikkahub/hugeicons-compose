package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AddMoneyCircle: ImageVector
    get() {
        if (_addMoneyCircle != null) {
            return _addMoneyCircle!!
        }
        _addMoneyCircle = ImageVector.Builder(
            name = "AddMoneyCircle",
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
        moveTo(11f, 9.5f)
        horizontalLineTo(12.5f)
        curveTo(13.3284f, 9.5f, 14f, 10.1716f, 14f, 11f)
        moveTo(11f, 9.5f)
        horizontalLineTo(9.5f)
        curveTo(8.67157f, 9.5f, 8f, 10.1716f, 8f, 11f)
        verticalLineTo(11.5f)
        curveTo(8f, 12.3284f, 8.67157f, 13f, 9.5f, 13f)
        horizontalLineTo(12.5f)
        curveTo(13.3284f, 13f, 14f, 13.6716f, 14f, 14.5f)
        verticalLineTo(15f)
        curveTo(14f, 15.8284f, 13.3284f, 16.5f, 12.5f, 16.5f)
        horizontalLineTo(11f)
        moveTo(11f, 9.5f)
        verticalLineTo(8f)
        moveTo(11f, 16.5f)
        horizontalLineTo(9.5f)
        curveTo(8.67157f, 16.5f, 8f, 15.8284f, 8f, 15f)
        moveTo(11f, 16.5f)
        verticalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 4.05493f)
        curveTo(11.6717f, 4.01863f, 11.338f, 4f, 11f, 4f)
        curveTo(6.02944f, 4f, 2f, 8.02944f, 2f, 13f)
        curveTo(2f, 17.9705f, 6.02944f, 22f, 11f, 22f)
        curveTo(15.9705f, 22f, 20f, 17.9705f, 20f, 13f)
        curveTo(20f, 12.662f, 19.9814f, 12.3283f, 19.9451f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 2f)
        verticalLineTo(9f)
        moveTo(22f, 5.5f)
        lineTo(15f, 5.5f)
        }
        }.build()

        return _addMoneyCircle!!
    }

private var _addMoneyCircle: ImageVector? = null
