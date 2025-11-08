package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ski: ImageVector
    get() {
        if (_ski != null) {
            return _ski!!
        }
        _ski = ImageVector.Builder(
            name = "Ski",
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
        moveTo(19.9983f, 4.5f)
        curveTo(19.9983f, 5.3284f, 19.3271f, 6f, 18.4992f, 6f)
        curveTo(17.6712f, 6f, 17f, 5.3284f, 17f, 4.5f)
        curveTo(17f, 3.67157f, 17.6712f, 3f, 18.4992f, 3f)
        curveTo(19.3271f, 3f, 19.9983f, 3.67157f, 19.9983f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.4787f, 7.81915f)
        lineTo(13.5537f, 6.85169f)
        curveTo(14.0995f, 6.36044f, 14.9207f, 6.33659f, 15.4942f, 6.79533f)
        lineTo(17f, 8f)
        moveTo(12.4787f, 7.81915f)
        lineTo(15.3f, 9.7f)
        lineTo(17f, 8f)
        moveTo(12.4787f, 7.81915f)
        lineTo(6f, 3.5f)
        moveTo(12.5f, 12.5f)
        lineTo(11.1068f, 11.5712f)
        curveTo(10.4329f, 11.1219f, 10.2587f, 10.2468f, 10.6307f, 9.58714f)
        moveTo(12.5f, 12.5f)
        lineTo(14.8608f, 14.1863f)
        curveTo(15.4191f, 14.5851f, 15.4191f, 15.4149f, 14.8608f, 15.8137f)
        lineTo(12.5f, 17.5f)
        moveTo(12.5f, 12.5f)
        lineTo(13.5f, 11.5f)
        moveTo(17f, 8f)
        lineTo(17.5f, 11.1667f)
        lineTo(21f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12f)
        lineTo(17f, 21f)
        lineTo(19.5f, 20.5f)
        }
        }.build()

        return _ski!!
    }

private var _ski: ImageVector? = null
