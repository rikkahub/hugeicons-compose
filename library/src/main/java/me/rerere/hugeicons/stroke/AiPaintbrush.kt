package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiPaintbrush: ImageVector
    get() {
        if (_aiPaintbrush != null) {
            return _aiPaintbrush!!
        }
        _aiPaintbrush = ImageVector.Builder(
            name = "AiPaintbrush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18.922f, 16.4224f)
            lineTo(21.4819f, 18.9835f)
            curveTo(21.8135f, 19.315f, 21.9997f, 19.7647f, 21.9997f, 20.2335f)
            curveTo(21.9997f, 21.2098f, 21.2083f, 22.0013f, 20.2319f, 22.0013f)
            curveTo(19.7631f, 22.0013f, 19.3135f, 21.815f, 18.9819f, 21.4835f)
            lineTo(16.4234f, 18.9238f)
            curveTo(16.1633f, 18.6636f, 15.7815f, 18.5672f, 15.4291f, 18.6728f)
            lineTo(12.1439f, 19.6572f)
            curveTo(11.4393f, 19.8684f, 10.6757f, 19.6757f, 10.1556f, 19.1556f)
            lineTo(9.35355f, 18.3536f)
            curveTo(9.12718f, 18.1272f, 9f, 17.8201f, 9f, 17.5f)
            curveTo(9f, 17.1799f, 9.12718f, 16.8728f, 9.35355f, 16.6464f)
            lineTo(16.6464f, 9.35355f)
            curveTo(16.8728f, 9.12718f, 17.1799f, 9f, 17.5f, 9f)
            curveTo(17.8201f, 9f, 18.1272f, 9.12718f, 18.3536f, 9.35355f)
            lineTo(19.1553f, 10.1553f)
            curveTo(19.6755f, 10.6755f, 19.8681f, 11.4395f, 19.6567f, 12.1442f)
            lineTo(18.6714f, 15.428f)
            curveTo(18.5657f, 15.7803f, 18.6619f, 16.1622f, 18.922f, 16.4224f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.5f, 3.5f)
            lineTo(7.29289f, 5.70711f)
            curveTo(7.10536f, 5.89464f, 7f, 6.149f, 7f, 6.41421f)
            verticalLineTo(9f)
            horizontalLineTo(4.53518f)
            curveTo(4.20083f, 9f, 3.8886f, 9.1671f, 3.70313f, 9.4453f)
            lineTo(3.21779f, 10.1733f)
            curveTo(3.07578f, 10.3863f, 3f, 10.6366f, 3f, 10.8926f)
            curveTo(3f, 11.2775f, 3.17094f, 11.6425f, 3.4666f, 11.8888f)
            lineTo(9f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15f, 2.75f)
            verticalLineTo(4f)
            moveTo(15f, 4f)
            verticalLineTo(5.25f)
            moveTo(15f, 4f)
            horizontalLineTo(14f)
            moveTo(15f, 4f)
            horizontalLineTo(16f)
            moveTo(17f, 4f)
            lineTo(16.1325f, 3.71082f)
            curveTo(15.7343f, 3.57811f, 15.4219f, 3.26568f, 15.2892f, 2.86754f)
            lineTo(15f, 2f)
            lineTo(14.7108f, 2.86754f)
            curveTo(14.5781f, 3.26568f, 14.2657f, 3.57811f, 13.8675f, 3.71082f)
            lineTo(13f, 4f)
            lineTo(13.8675f, 4.28918f)
            curveTo(14.2657f, 4.42189f, 14.5781f, 4.73432f, 14.7108f, 5.13246f)
            lineTo(15f, 6f)
            lineTo(15.2892f, 5.13246f)
            curveTo(15.4219f, 4.73432f, 15.7343f, 4.42189f, 16.1325f, 4.28918f)
            lineTo(17f, 4f)
            close()
        }
        }.build()

        return _aiPaintbrush!!
    }

private var _aiPaintbrush: ImageVector? = null
